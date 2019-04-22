package com.sell.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ImageImpl;
import com.sell.dao.impl.ProductImpl;
import com.sell.entity.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryImpl category;
	@Autowired
	ImageImpl listImage;
	@Autowired
	ProductImpl product;

	@RequestMapping("/htc")
	public String htc(Model model) {
		Category category = new CategoryImpl().getCategory(1);
		model.addAttribute("category", category.getCategory());
		model.addAttribute("product", product.getListProductByCategory(category));
		return "view/Category";
	}

	@RequestMapping("/iphone")
	public String iphone(Model model) {
		Category category = new CategoryImpl().getCategory(2);
		model.addAttribute("category", category.getCategory());

		model.addAttribute("product", product.getListProductByCategory(category));
		return "view/Category";
	}

	@RequestMapping("/samsung")
	public String samsung(Model model) {
		Category category = new CategoryImpl().getCategory(6);
		model.addAttribute("category", category.getCategory());

		model.addAttribute("product", product.getListProductByCategory(category));
		return "view/Category";
	}

	@RequestMapping("/nokia")
	public String nokia(Model model) {
		Category category = new CategoryImpl().getCategory(3);
		model.addAttribute("category", category.getCategory());

		model.addAttribute("product", product.getListProductByCategory(category));
		return "view/Category";
	}

	@RequestMapping("/blackberry")
	public String blackberry(Model model) {
		Category category = new CategoryImpl().getCategory(5);
		model.addAttribute("category", category.getCategory());

		model.addAttribute("product", product.getListProductByCategory(category));
		return "view/Category";
	}

	@RequestMapping("/sony")
	public String sony(Model model) {
		Category category = new CategoryImpl().getCategory(4);
		model.addAttribute("category", category.getCategory());

		model.addAttribute("product", product.getListProductByCategory(category));
		return "view/Category";
	}
}
