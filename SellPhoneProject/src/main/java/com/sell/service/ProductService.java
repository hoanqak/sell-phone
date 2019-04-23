package com.sell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sell.dao.impl.ProductImpl;
@Service
public class ProductService {

	@Autowired
	ProductImpl productImpl;
	
	public void getProduct(int id, Model model) {
		model.addAttribute("product", productImpl.getProduct(id));
	}
	
}
