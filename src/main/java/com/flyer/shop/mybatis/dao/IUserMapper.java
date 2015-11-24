/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * IUserMapper.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.mybatis.dao;

import java.io.Serializable;
import java.util.List;

import com.flyer.shop.common.Mapper;
import com.flyer.shop.model.RelUserAndRole;
import com.flyer.shop.model.User;

/**
 * 用户Mapper
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public interface IUserMapper extends Mapper<User, Serializable> {

	User authentication(User user);

	int deleteRoleAndRole(Long userId);

	int insertUserAndRole(List<RelUserAndRole> relUserAndRole);
}
