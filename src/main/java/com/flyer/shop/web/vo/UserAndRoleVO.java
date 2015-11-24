/**
 * Copyright © 2015 长春六元素科技有限公司
 * 
 * All right reserved.
 * 
 * UserAndRoleVO.java   创建时间 ：2015年6月24日
 */
package com.flyer.shop.web.vo;

import java.util.List;

import com.flyer.shop.model.RelUserAndRole;

/**
 * 用户和角色VO类
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class UserAndRoleVO {

	List<RelUserAndRole> relUserAndRoles;

	public List<RelUserAndRole> getRelUserAndRoles() {
		return relUserAndRoles;
	}

	public void setRelUserAndRoles(List<RelUserAndRole> relUserAndRoles) {
		this.relUserAndRoles = relUserAndRoles;
	}

}
