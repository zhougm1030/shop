/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * User.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.model;

import com.flyer.shop.common.CommonModel;

/**
 * 用户模型
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class User extends CommonModel {
	private String username;
	private String password;
	private String realname;
	private Dictionary dicSex;
	private String address;
	private String email;
	private String telephone;
	private Role role;

	private Dictionary dicStatus;

	/**
	 * 构造函数
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 构造函数
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 */
	public User(String username, String password) {

		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Dictionary getDicSex() {
		return dicSex;
	}

	public void setDicSex(Dictionary dicSex) {
		this.dicSex = dicSex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Dictionary getDicStatus() {
		return dicStatus;
	}

	public void setDicStatus(Dictionary dicStatus) {
		this.dicStatus = dicStatus;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", realname=" + realname + ", dicSex=" + dicSex
				+ ", address=" + address + ", email=" + email + ", telephone="
				+ telephone + ", role=" + role + ", dicStatus=" + dicStatus
				+ ", getId()=" + getId() + ", getCreateTime()="
				+ getCreateTime() + "]";
	}
}
