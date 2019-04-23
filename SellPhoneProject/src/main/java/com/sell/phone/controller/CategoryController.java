package com.sell.phone.controller;

import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.service.CategoryService;
import com.sell.service.Pagination;
import com.sell.service.ProductService;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    CategoryImpl categoryImpl;
    @Autowired
    Pagination pagination;
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

    @RequestMapping("/{category}/iphone")
    public String redirectIphone() {
        System.out.println("Here");
        return "redirect:/iphone";
    }

    @RequestMapping("/{category}/htc")
    public String redirectHtc() {
        System.out.println("Here");
        return "redirect:/htc";
    }

    @RequestMapping("/{category}/blackberry")
    public String redirectBlack() {
        System.out.println("Here");
        return "redirect:/blackberry";
    }

    @RequestMapping("/{category}/sony")
    public String redirectSony() {
        System.out.println("Here");
        return "redirect:/sony";
    }

    @RequestMapping("/{category}/nokia")
    public String redirectNokia() {
        System.out.println("Here");
        return "redirect:/nokia";
    }
    
    @RequestMapping("Iphone/{something}-{id}")
    public String iphone(@PathVariable("id") int id, Model model) {
    	System.out.println("Come");
    	productService.getProduct(id, model);
    	return "view/show-info";
    }
    @RequestMapping("/htc-page-{page}")
    public String htcPage(Model model, @PathVariable("page") int page) {
    	categoryService.htc(model, page);
        return "view/Category";
    }
    @RequestMapping("/samsung-page-{page}")
    public String samsungPage(Model model, @PathVariable("page") int page) {
    	categoryService.samsung(model, page);
    	return "view/Category";
    }
    @RequestMapping("/sony-page-{page}")
    public String sonyPage(Model model, @PathVariable("page") int page) {
    	categoryService.sony(model, page);
    	return "view/Category";
    }
    @RequestMapping("/blackberry-page-{page}")
    public String blackberryPage(Model model, @PathVariable("page") int page) {
    	categoryService.blackberry(model, page);
    	return "view/Category";
    }
    @RequestMapping("/iphone-page-{page}")
    public String iphonePage(Model model, @PathVariable("page") int page) {
    	categoryService.iphone(model, page);
    	return "view/Category";
    }
    @RequestMapping("/nokia-page-{page}")
    public String nokiaPage(Model model, @PathVariable("page") int page) {
    	categoryService.nokia(model, page);
    	return "view/Category";
    }
    
}
