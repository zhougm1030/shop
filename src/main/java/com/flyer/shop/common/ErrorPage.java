/**
 * Copyright © 2015 长春六元素科技有限公司
 * 
 * All right reserved.
 * 
 * ErrorPage.java   创建时间 ：2015年6月23日
 */
package com.flyer.shop.common;

/**
 * 功能类
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
public enum ErrorPage {
	
	PAGE404("/error/404"),PAGE401("/error/401");
	
	 private final String value;

     //构造器默认也只能是private, 从而保证构造函数只能在内部使用
	 ErrorPage(String value) {
         this.value = value;
     }
	 
	 public String getValue() {
         return value;
     }

}
