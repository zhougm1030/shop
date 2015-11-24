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
import com.flyer.shop.model.RelRoleAndAuthority;
import com.flyer.shop.model.Role;
import com.flyer.shop.model.User;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public interface IRoleService extends IService<Role, Serializable>{
	
	List<Role> selectRolesByUserId(Long id);
	
	int insertRoleAndAuthority(List<RelRoleAndAuthority> relRoleAndAuthoritys);
	
	int deleteRoleAndAuthority(Long roleId);
	
	List<Role> selectUserAndRole(User user,int pageNum, int pageSize);

}
