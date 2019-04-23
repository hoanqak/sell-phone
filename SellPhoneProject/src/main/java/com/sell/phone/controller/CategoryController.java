package com.sell.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.dao.impl.ProductImpl;
import com.sell.entity.Product;
import com.sell.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductImpl productImpl;
	
	@RequestMapping("/htc")
	public String htc(Model model) {
		categoryService.htc(model, 1);
		return "view/Category";
	}

	@RequestMapping("/iphone")
	public String iphone(Model model) {
		categoryService.iphone(model, 1);

		return "view/Category";
	}

	@RequestMapping("/samsung")
	public String samsung(Model model) {
		categoryService.samsung(model, 1);

		return "view/Category";
	}

	@RequestMapping("/nokia")
	public String nokia(Model model) {
		categoryService.nokia(model, 1);

		return "view/Category";
	}

	@RequestMapping("/blackberry")
	public String blackberry(Model model) {
		categoryService.blackberry(model, 1);

		return "view/Category";
	}

	@RequestMapping("/sony")
	public String sony(Model model) {
		categoryService.sony(model, 1);
		return "view/Category";
	}
	
	@RequestMapping("htc-page-{i}")
	public String htcPage(@PathVariable("i") int page, Model model) {
		categoryService.htc(model, page);
		return "view/Category";

	}
	@RequestMapping("sony-page-{i}")
	public String sonyPage(@PathVariable("i") int page, Model model) {
		categoryService.sony(model, page);
		return "view/Category";
	}
	@RequestMapping("samsung-page-{i}")
	public String samsungPage(@PathVariable("i") int page, Model model) {
		categoryService.samsung(model, page);
		return "view/Category";
	}
	@RequestMapping("iphone-page-{i}")
	public String iphonePage(@PathVariable("i") int page, Model model) {
		categoryService.iphone(model, page);
		return "view/Category";
	}
	@RequestMapping("blackberry-page-{i}")
	public String blackberryPage(@PathVariable("i") int page, Model model) {
		categoryService.blackberry(model, page);
		return "view/Category";
	}
	
	@RequestMapping("nokia-page-{i}")
	public String nokiaPage(@PathVariable("i") int page, Model model) {
		categoryService.nokia(model, page);
		return "view/Category";
	}
	
}
