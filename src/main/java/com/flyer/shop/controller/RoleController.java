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

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.flyer.shop.common.AbsController;
import com.flyer.shop.common.IService;
import com.flyer.shop.model.RelRoleAndAuthority;
import com.flyer.shop.model.Role;
import com.flyer.shop.model.User;
import com.flyer.shop.service.IRoleService;
import com.flyer.shop.service.IUserService;
import com.flyer.shop.web.vo.RoleAndAuthorityVO;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Controller
@RequestMapping("/role")
public class RoleController extends AbsController<Role, Serializable> {

	@Autowired
	private IRoleService roleService;

	@Autowired
	private IUserService userService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rgsis.framework.common.AbsController#setService(com.rgsis.framework
	 * .common.IService)
	 */
	@Autowired
	@Override
	public void setService(IService<Role, Serializable> service) {
		// TODO Auto-generated method stub
		super.setService(roleService);
	}

	/**
	 * 角色授权
	 * 
	 * @param roleAndAuthority
	 * @return
	 */
	@RequiresRoles("admin")
	@RequestMapping("/roleAuth")
	public String roleAuth(RoleAndAuthorityVO roleAndAuthority, Role role) {
		List<RelRoleAndAuthority> rels = roleAndAuthority.getRoleAndAuthority();
		List<RelRoleAndAuthority> index = new ArrayList<RelRoleAndAuthority>();
		if (rels != null) {
			for (int i = 0; i < rels.size(); i++) {
				RelRoleAndAuthority rel = rels.get(i);
				if (rel.getAuthority() != null) {
					rel.setRole(role);
				} else {
					index.add(rel);
				}
			}
			rels.removeAll(index);
			roleService.insertRoleAndAuthority(rels);
		} else {
			roleService.deleteRoleAndAuthority(role.getId());
		}
		return getRedirectUrl();
	}

	@RequestMapping("/userRole")
	public String userRole(User user, Model model,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", defaultValue = "0") int pageSize) {
		List<Role> roles = roleService.selectUserAndRole(user, pageNum,  pageSize);
		model.addAttribute("list", roles);
		model.addAttribute("page", new PageInfo<Role>(roles));

		List<User> users = userService.select(user, 1, 0);
		model.addAttribute("user", users.get(0));
		return "manager/userroleaciton";
	}

	@Override
	public String getRedirectUrl() {
		// TODO Auto-generated method stub
		return "redirect:/rest/role/get";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.AbsController#getPageUrl()
	 */
	@Override
	public String getPageUrl() {
		// TODO Auto-generated method stub
		return "manager/roleview";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.AbsController#getEditPage()
	 */
	@Override
	public String getEditPage() {
		// TODO Auto-generated method stub
		return "manager/roleadd";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.AbsController#getCurrentClass()
	 */
	@Override
	public Class<?> getCurrentClass() {
		// TODO Auto-generated method stub
		return this.getClass();
	}

}
