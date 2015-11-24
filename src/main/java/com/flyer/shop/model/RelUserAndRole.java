/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * RelUserAndRole.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.model;

import com.flyer.shop.common.CommonModel;

/**
 * 用户和角色关联模型
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class RelUserAndRole extends CommonModel{
	
	private User user;
	private Role role;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "RelUserAndRole [user=" + user + ", role=" + role + ", getId()="
				+ getId() + ", getCreateTime()=" + getCreateTime() + "]";
	}

}
