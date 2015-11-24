/**
 * Copyright © 2015 长春六元素科技有限公司
 * 
 * All right reserved.
 * 
 * AuthorityController.java   创建时间 ：2015年6月19日
 */
package com.flyer.shop.controller;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.flyer.shop.common.AbsController;
import com.flyer.shop.common.IService;
import com.flyer.shop.model.Authority;
import com.flyer.shop.model.Role;
import com.flyer.shop.service.IAuthorityService;
import com.flyer.shop.service.IRoleService;

/**
 * 权限管理controller
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Controller
@RequestMapping("/authority")
public class AuthorityController extends AbsController<Authority, Serializable> {

	@Autowired
	private IAuthorityService authService;

	@Autowired
	private IRoleService roleService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rgsis.framework.common.AbsController#setService(com.rgsis.framework
	 * .common.IService)
	 */
	@Autowired
	@Override
	public void setService(IService<Authority, Serializable> service) {
		// TODO Auto-generated method stub
		super.setService(authService);
	}

	/**
	 * 权限列表
	 * 
	 * @param role
	 * @param model
	 * @return
	 */
	@RequiresRoles("admin")
	@RequestMapping("/auth")
	public String authority(@Valid Role role, Model model,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", defaultValue = "0") int pageSize) {

		List<Role> roles = roleService.select(role, 1, 0);
		model.addAttribute("role", roles.get(0));
		List<Authority> auths = authService.selectAuthorityaAndRole(role
				.getId(),pageNum, pageSize);

		model.addAttribute("list", auths);
		model.addAttribute("page", new PageInfo<Authority>(auths));
		return "manager/roleauthaciton";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.AbsController#getRedirectUrl()
	 */
	@Override
	public String getRedirectUrl() {
		// TODO Auto-generated method stub
		return "redirect:/rest/authority/get";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.AbsController#getPageUrl()
	 */
	@Override
	public String getPageUrl() {
		// TODO Auto-generated method stub
		return "manager/authorityview";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.AbsController#getEditPage()
	 */
	@Override
	public String getEditPage() {
		// TODO Auto-generated method stub
		return "manager/authorityadd";
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
