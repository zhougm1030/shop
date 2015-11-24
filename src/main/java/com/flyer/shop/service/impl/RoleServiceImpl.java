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

import com.github.pagehelper.PageHelper;
import com.flyer.shop.common.Mapper;
import com.flyer.shop.common.ServiceImpl;
import com.flyer.shop.model.RelRoleAndAuthority;
import com.flyer.shop.model.Role;
import com.flyer.shop.model.User;
import com.flyer.shop.mybatis.dao.IRoleMapper;
import com.flyer.shop.service.IRoleService;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Service
public class RoleServiceImpl extends ServiceImpl<Role, Serializable> implements
		IRoleService {

	@Autowired
	private IRoleMapper roleMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rgsis.framework.common.ServiceImpl#setMapper(com.rgsis.framework.
	 * common.Mapper)
	 */
	@Override
	@Autowired
	public void setMapper(Mapper<Role, Serializable> mapper) {
		// TODO Auto-generated method stub
		super.setMapper(roleMapper);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rgsis.framework.service.IRoleService#selectRolesByUserId(java.lang
	 * .Long)
	 */
	@Override
	public List<Role> selectRolesByUserId(Long id) {
		// TODO Auto-generated method stub
		return roleMapper.selectRolesByUserId(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rgsis.framework.service.IRoleService#insertRoleAndAuthority(java.
	 * util.List)
	 */
	@Override
	public int insertRoleAndAuthority(
			List<RelRoleAndAuthority> relRoleAndAuthoritys) {
		if (relRoleAndAuthoritys != null
				&& relRoleAndAuthoritys.get(0).getRole() != null) {
			roleMapper.deleteRoleAndAuthority(relRoleAndAuthoritys.get(0).getRole().getId());
		}
		int r = roleMapper.insertRoleAndAuthority(relRoleAndAuthoritys);
		return r;
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IRoleService#deleteRoleAndAuthority(java.lang.Long)
	 */
	@Override
	public int deleteRoleAndAuthority(Long roleId) {
		// TODO Auto-generated method stub
		return roleMapper.deleteRoleAndAuthority(roleId);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IRoleService#selectUserAndRole(com.rgsis.framework.model.User)
	 */
	@Override
	public List<Role> selectUserAndRole(User user,int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return roleMapper.selectUserAndRole(user);
	}
}
