/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * Model.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.common;

import java.util.Date;

/**
 * 功能类
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class CommonModel {

	private Long id;
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", createTime=" + createTime + "]";
	}

}
