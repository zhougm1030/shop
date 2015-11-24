/**
 * Copyright © 2015 长春六元素科技有限公司
 * 
 * All right reserved.
 * 
 * RoleAndAuthorityVO.java   创建时间 ：2015年6月23日
 */
package com.flyer.shop.web.vo;

import java.util.List;

import com.flyer.shop.model.RelRoleAndAuthority;

/**
 * 功能类
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class RoleAndAuthorityVO {
	private List<RelRoleAndAuthority> roleAndAuthority;

	public List<RelRoleAndAuthority> getRoleAndAuthority() {
		return roleAndAuthority;
	}

	public void setRoleAndAuthority(List<RelRoleAndAuthority> roleAndAuthority) {
		this.roleAndAuthority = roleAndAuthority;
	}

}
