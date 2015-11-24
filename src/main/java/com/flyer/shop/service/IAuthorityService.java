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
import com.flyer.shop.model.Authority;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public interface IAuthorityService extends IService<Authority, Serializable> {
	
	/**
	 * 根据角色id查询权限
	 * @param roleId
	 * @return
	 */
	List<Authority> selectAuthoritysByRoleId(Long roleId);
	
	List<Authority> selectAuthorityaAndRole(Long roleId,int pageNum, int pageSize);
}
