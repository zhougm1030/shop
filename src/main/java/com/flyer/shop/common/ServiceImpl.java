/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * BaseServiceImpl.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.common;

import java.io.Serializable;
import java.util.List;

import com.github.pagehelper.PageHelper;

/**
 * 服务层基本类实现
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class ServiceImpl<T, PK extends Serializable> implements IService<T, PK> {

	private Mapper<T, PK> mapper;

	/**
	 * 注入 mapper对象 ，子类必须重写
	 * @param mapper
	 */
	public void setMapper(Mapper<T, PK> mapper) {
		this.mapper = mapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.IBaseService#select(java.lang.Object)
	 */
	@Override
	public List<T> select(T t , int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<T> list =  mapper.select(t);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.IBaseService#insert(java.lang.Object)
	 */
	@Override
	public int insert(T t) {
		// TODO Auto-generated method stub
		return mapper.insert(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.IBaseService#update(java.lang.Object)
	 */
	@Override
	public int update(T t) {
		// TODO Auto-generated method stub
		return mapper.update(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rgsis.framework.common.IBaseService#delete(java.lang.Object)
	 */
	@Override
	public int delete(T t) {
		// TODO Auto-generated method stub
		return mapper.delete(t);
	}

}
