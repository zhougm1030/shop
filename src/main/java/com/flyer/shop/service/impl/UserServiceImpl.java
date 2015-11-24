/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * UserInfo.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyer.shop.common.Mapper;
import com.flyer.shop.common.ServiceImpl;
import com.flyer.shop.model.RelUserAndRole;
import com.flyer.shop.model.User;
import com.flyer.shop.mybatis.dao.IUserMapper;
import com.flyer.shop.service.IUserService;

/**
 * 用户服务类
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<User, Serializable> implements IUserService {
	
	
	@Autowired
	private IUserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.ServiceImpl#setMapper(com.rgsis.framework.common.Mapper)
	 */
	@Override
	@Autowired
	public void setMapper(Mapper<User, Serializable> mapper) {
		// TODO Auto-generated method stub
		super.setMapper(userMapper);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IUserService#selectUserByName(java.lang.String)
	 */
	@Override
	public User selectUserByName(String username) {
		// TODO Auto-generated method stub
		List<User> user = userMapper.select(new User(username, null));
		return user.get(0);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IUserService#authentication(com.rgsis.framework.model.User)
	 */
	@Override
	public User authentication(User user) {
		// TODO Auto-generated method stub
		return userMapper.authentication(user);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IUserService#deleteRoleAndRole(java.lang.Long)
	 */
	@Override
	public int deleteRoleAndRole(Long userId) {
		// TODO Auto-generated method stub
		return userMapper.deleteRoleAndRole(userId);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IUserService#insertUserAndAuthority(java.util.List)
	 */
	@Override
	public int insertUserAndRole(List<RelUserAndRole> relUserAndRole) {
		if (relUserAndRole != null
				&& relUserAndRole.get(0).getRole() != null) {
			userMapper.deleteRoleAndRole(relUserAndRole.get(0).getUser().getId());
		}
		int r = userMapper.insertUserAndRole(relUserAndRole);
		return r;
	}

}
