package com.sell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.sell.dao.impl.ProductImpl;

@Service
public class HomeController {

	@Autowired
	ProductImpl product;
	public String index(Model model) {
		model.addAttribute("listProductHightLight", product.getProductNew(15));
		model.addAttribute("listProductNew", product.getProductNew(15));
		return "view/Home";
	}
	
}
