/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * Dictionary.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.model;

import com.flyer.shop.common.CommonModel;

/**
 * 字典模型
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public class Dictionary extends CommonModel{

	private Long code;
	private int subCode;
	private String subName;


	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Dictionary [code=" + code + ", subCode=" + subCode
				+ ", subName=" + subName + ", getId()=" + getId()
				+ ", getCreateTime()=" + getCreateTime() + "]";
	}

}
