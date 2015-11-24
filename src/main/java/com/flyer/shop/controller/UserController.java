/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * UserInfo.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyer.shop.common.AbsController;
import com.flyer.shop.common.IService;
import com.flyer.shop.model.RelUserAndRole;
import com.flyer.shop.model.User;
import com.flyer.shop.service.IUserService;
import com.flyer.shop.web.vo.UserAndRoleVO;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.1
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbsController<User, Serializable>{

	@Autowired
	private IUserService userService;
	
	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.AbsController#setService(com.rgsis.framework.common.IService)
	 */
	@Autowired
	@Override
	public void setService(IService<User, Serializable> service) {
		// TODO Auto-generated method stub
		super.setService(userService);
	}

	
	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.AbsController#setRedirectUrl(java.lang.String)
	 */
	@RequestMapping(value = "/login")
	public String login(@Valid User user, BindingResult result, Model model,
			HttpServletRequest request) {
		try {
			Subject subject = SecurityUtils.getSubject();

			if (result.hasErrors()) {
				model.addAttribute("error", "参数错误！");
				return "login";
			}
			// 身份验证
			String pwd = new Sha256Hash(user.getPassword(), user.getUsername(), 1024).toBase64();
			System.err.println(pwd);
			subject.login(new UsernamePasswordToken(user.getUsername(), pwd));
			// 验证成功在Session中保存用户信息
			Session  session = subject.getSession();
			session.setAttribute("userInfo", user);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			// 身份验证失败
			model.addAttribute("error", "用户名或密码错误 ！");
			return "login";
		}
		return "redirect:/rest/main";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
		}
		return "redirect:/rest/login";
	}
	
	@RequiresRoles("admin") 
	@RequestMapping("/userAuth")
	public String userAuth(UserAndRoleVO userAndRole ,User user, Model model){
		
		List<RelUserAndRole> rels = userAndRole.getRelUserAndRoles();
		List<RelUserAndRole> index = new ArrayList<RelUserAndRole>();
		if (rels!=null) {
			for (int i = 0; i < rels.size(); i++) {
				RelUserAndRole rel = rels.get(i);
				if(rel.getRole()!=null){
					rel.setUser(user);
				}else{
					index.add(rel);
				}
			}
			rels.removeAll(index);
			userService.insertUserAndRole(rels);
		}else{
			userService.deleteRoleAndRole(user.getId());
		}
		return getRedirectUrl();
	}



	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.AbsController#getRedirectUrl()
	 */
	@Override
	public String getRedirectUrl() {
		// TODO Auto-generated method stub
		return "redirect:/rest/user/get";
	}


	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.AbsController#getPageUrl()
	 */
	@Override
	public String getPageUrl() {
		// TODO Auto-generated method stub
		return "manager/userview";
	}


	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.AbsController#getEditPage()
	 */
	@Override
	public String getEditPage() {
		// TODO Auto-generated method stub
		return "manager/useradd";
	}


	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.AbsController#getCurrentClass()
	 */
	@Override
	public Class<?> getCurrentClass() {
		// TODO Auto-generated method stub
		return this.getClass();
	}
	
	@Override
	@RequiresPermissions("user:create")
	public String add(User user, Model model) {
		// TODO Auto-generated method stub
		if(user.getPassword() == null ){
			// 身份验证
			// 新建用户密码默认为000000
			user.setPassword(new Sha256Hash("000000", user.getUsername(), 1024).toBase64());
		}
		int i = userService.insert(user);
		model.addAttribute("re", i);
		return getRedirectUrl();
	}
	

}
