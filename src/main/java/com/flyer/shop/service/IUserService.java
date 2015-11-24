/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * UserInfo.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.service;

import java.io.Serializable;
import java.util.List;

import com.flyer.shop.common.IService;
import com.flyer.shop.model.RelUserAndRole;
import com.flyer.shop.model.User;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public interface IUserService extends IService<User, Serializable>{
	
	/**
	 * 根据用户名查询用户信息
	 * @param username 用户名
	 * @return
	 */
	User selectUserByName(String username);

	/**
	 * 用户验证
	 * @param user
	 * @return
	 */
	User authentication(User user);
	
	
	int deleteRoleAndRole(Long userId);
	
	int insertUserAndRole(List<RelUserAndRole> relUserAndRole);
	

}
