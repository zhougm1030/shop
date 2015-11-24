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
import com.flyer.shop.model.Authority;
import com.flyer.shop.mybatis.dao.IAuthorityMapper;
import com.flyer.shop.service.IAuthorityService;

/**
 * 功能
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Service
public class AuthorityServiceImpl extends ServiceImpl<Authority, Serializable> implements IAuthorityService {

	@Autowired
	private IAuthorityMapper authMapper;
	
	/* (non-Javadoc)
	 * @see com.rgsis.framework.common.ServiceImpl#setMapper(com.rgsis.framework.common.Mapper)
	 */
	@Override
	@Autowired
	public void setMapper(Mapper<Authority, Serializable> mapper) {
		// TODO Auto-generated method stub
		super.setMapper(authMapper);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IAuthorityService#selectAuthoritysByRoleId(java.lang.Long)
	 */
	@Override
	public List<Authority> selectAuthoritysByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return authMapper.selectAuthoritysByRoleId(roleId);
	}

	/* (non-Javadoc)
	 * @see com.rgsis.framework.service.IAuthorityService#selectAuthorityaAndRole(java.lang.Long)
	 */
	@Override
	public List<Authority> selectAuthorityaAndRole(Long roleId,int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return authMapper.selectAuthorityaAndRole(roleId);
	}



}
