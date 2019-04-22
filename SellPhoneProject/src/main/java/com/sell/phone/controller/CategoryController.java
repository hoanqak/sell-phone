package com.sell.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("/htc")
	public String htc(Model model) {
		categoryService.htc(model);
		return "view/Category";
	}

	@RequestMapping("/iphone")
	public String iphone(Model model) {
		categoryService.iphone(model);

		return "view/Category";
	}

	@RequestMapping("/samsung")
	public String samsung(Model model) {
		categoryService.samsung(model);

		return "view/Category";
	}

	@RequestMapping("/nokia")
	public String nokia(Model model) {
		categoryService.nokia(model);

		return "view/Category";
	}

	@RequestMapping("/blackberry")
	public String blackberry(Model model) {
		categoryService.blackberry(model);

		return "view/Category";
	}

	@RequestMapping("/sony")
	public String sony(Model model) {
		categoryService.sony(model);
		return "view/Category";
	}
}
