/**
 * Copyright © 2015 长春六元素科技有限公司 
 * 
 * All right reserved.
 * 
 * UserInfo.java   创建时间 ：2015年6月17日
 */
package com.flyer.shop.common;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

/**
 * 基本的controller
 *
 * @author Zhou Guomin
 * 
 * @version 1.0
 *
 */
@Controller
public abstract class AbsController<T, PK extends Serializable> {

	/**
	 * redirect 跳转
	 * 
	 * @return
	 */
	public abstract String getRedirectUrl();

	/**
	 * view页面的跳转
	 * 
	 * @return
	 */
	public abstract String getPageUrl();

	/**
	 * 编辑页面的跳转
	 * 
	 * @return
	 */
	public abstract String getEditPage();

	public abstract Class<?> getCurrentClass();

	@Autowired
	private IService<T, Serializable> service;

	public void setService(IService<T, Serializable> service) {
		this.service = service;
	}

	@RequestMapping("/get")
	public String get(@Valid T t, Model model,
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", defaultValue = "0") int pageSize) {

		Subject subject = SecurityUtils.getSubject();
		String modelName = getCurrentClass().getSimpleName().toLowerCase()
				.replace("controller", "");
		if (subject.isPermitted(modelName + ":view")) {
			List<T> ts = service.select(t, pageNum, pageSize);
			model.addAttribute("list", ts);
			PageInfo<T> page = new PageInfo<T>(ts);
			model.addAttribute("page", page);
		}
		return getPageUrl();
	}

	@RequestMapping("/add")
	public String add(@Valid T t, Model model) {

		Subject subject = SecurityUtils.getSubject();
		String modelName = getCurrentClass().getSimpleName().toLowerCase()
				.replace("controller", "");
		if (subject.isPermitted(modelName + ":create")) {
			int i = service.insert(t);
			model.addAttribute("re", i);
			return getRedirectUrl();
		}
		return ErrorPage.PAGE401.getValue();
	}

	@RequestMapping("/edit")
	public String edit(@Valid T t, Model model) {

		Subject subject = SecurityUtils.getSubject();
		String modelName = getCurrentClass().getSimpleName().toLowerCase()
				.replace("controller", "");
		if (subject.isPermitted(modelName + ":edit")) {
			List<T> list = service.select(t, 1, 0);
			if (!list.isEmpty()) {
				T obj = list.get(0);
				model.addAttribute("r", obj);
				model.addAttribute("op", "update");
			}
			return getEditPage();
		}
		return ErrorPage.PAGE401.getValue();

	}

	@RequestMapping("/update")
	public String update(@Valid T t, Model model) {

		Subject subject = SecurityUtils.getSubject();
		String modelName = getCurrentClass().getSimpleName().toLowerCase()
				.replace("controller", "");
		if (subject.isPermitted(modelName + ":update")) {
			int i = service.update(t);
			model.addAttribute("r", i);
			return getRedirectUrl();
		}
		return ErrorPage.PAGE401.getValue();
	}

	@RequestMapping("/delete")
	public String delete(@Valid T t, Model model) {
		Subject subject = SecurityUtils.getSubject();
		String modelName = getCurrentClass().getSimpleName().toLowerCase()
				.replace("controller", "");
		if (subject.isPermitted(modelName + ":delete")) {
			int i = service.delete(t);
			model.addAttribute("r", i);
			return getRedirectUrl();
		}
		return ErrorPage.PAGE401.getValue();
	}

}
