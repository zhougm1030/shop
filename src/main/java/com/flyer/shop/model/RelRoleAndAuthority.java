/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * RelRoleAndAuthority.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.model;

import com.flyer.shop.common.CommonModel;

/**
 * 角色和权限关联模型
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class RelRoleAndAuthority extends CommonModel {

	private Role role;
	private Authority authority;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "RelRoleAndAuthority [role=" + role + ", authority=" + authority
				+ ", getId()=" + getId() + ", getCreateTime()="
				+ getCreateTime() + "]";
	}
}
