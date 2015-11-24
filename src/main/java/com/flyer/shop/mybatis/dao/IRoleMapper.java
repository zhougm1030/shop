/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * IRoleMapper.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.mybatis.dao;

import java.io.Serializable;
import java.util.List;

import com.flyer.shop.common.Mapper;
import com.flyer.shop.model.RelRoleAndAuthority;
import com.flyer.shop.model.Role;
import com.flyer.shop.model.User;

/**
 * 功能类
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public interface IRoleMapper extends Mapper<Role, Serializable>{
	
	List<Role> selectRolesByUserId(Long userId);
	
	int insertRoleAndAuthority(List<RelRoleAndAuthority> list);
	
	/**
	 * 删除关联表信息
	 * @param roleId
	 * @return
	 */
	int deleteRoleAndAuthority(Long roleId);
	
	/**
	 * 查询用户关联的角色
	 * @param user
	 * @return
	 */
	List<Role> selectUserAndRole(User user);

}
