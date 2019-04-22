package com.sell.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ImageImpl;
import com.sell.dao.impl.ProductImpl;

@Controller
public class MainController {

	@Autowired
	CategoryImpl category;
	@Autowired
	ImageImpl listImage;
	@Autowired
	ProductImpl product;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("listProductHightLight", product.getProductNew(15));
		model.addAttribute("listProductNew", product.getProductNew(15));
		return "view/Home";
	}
	
	
}
