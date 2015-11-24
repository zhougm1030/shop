package com.flyer.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Controller
public class PageController {
	
	
	/**
	 * 一般页面跳转
	 * @param page 页面名称
	 * @return
	 */
	@RequestMapping("/{page}")
	public String redirect(@PathVariable String page){
		return page;
	}
	
	
	/**
	 * 管理页面跳转
	 * @param page 页面名称
	 * @return
	 */
	@RequestMapping("/manager/{page}")
	public String manager(@PathVariable String page){
		return "manager/"+page;
	}
	
	
	/**
	 * 错误页面
	 * @param page 页面名称
	 * @return
	 */
	@RequestMapping("/error/{page}")
	public String error(@PathVariable String page) {
		return "error/"+page;
	}

}
