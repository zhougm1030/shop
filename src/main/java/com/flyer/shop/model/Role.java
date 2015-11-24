/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * Role.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.model;

import java.util.List;

import com.flyer.shop.common.CommonModel;

/**
 * 角色模型
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class Role extends CommonModel {

	private String roleName;
	private String roleSign;
	private String roleDesc;
	
	private List<User> users;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleSign() {
		return roleSign;
	}

	public void setRoleSign(String roleSign) {
		this.roleSign = roleSign;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", roleSign=" + roleSign
				+ ", roleDesc=" + roleDesc + ", getId()=" + getId()
				+ ", getCreateTime()=" + getCreateTime() + "]";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


}
