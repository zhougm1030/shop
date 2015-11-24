/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * Authority.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.model;

import java.util.List;

import com.flyer.shop.common.CommonModel;

/**
 * 权限模型
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class Authority extends CommonModel{

	private String authName;
	private String authSign;
	private String authDesc;
	
	private List<Role> roles;

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthSign() {
		return authSign;
	}

	public void setAuthSign(String authSign) {
		this.authSign = authSign;
	}

	public String getAuthDesc() {
		return authDesc;
	}

	public void setAuthDesc(String authDesc) {
		this.authDesc = authDesc;
	}

	@Override
	public String toString() {
		return "Authority [authName=" + authName + ", authSign=" + authSign
				+ ", authDesc=" + authDesc + ", getId()=" + getId()
				+ ", getCreateTime()=" + getCreateTime() + "]";
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
