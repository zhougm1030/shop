/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * IBaseService.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.common;

import java.io.Serializable;
import java.util.List;

/**
 * 服务层基本类接口
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public interface IService<T, PK extends Serializable> {

	/**
	 * 查询
	 */
	List<T> select(T t , int pageNum, int pageSize);

	/**
	 * 插入
	 */
	int insert(T t);

	/**
	 * 更新
	 */
	int update(T t);

	/**
	 * 删除
	 */
	int delete(T t);

}
