package com.sell.phone.controller;

import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ProductImpl;
import com.sell.entity.Category;
import com.sell.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PatchMapping;
=======
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.dao.impl.ProductImpl;
import com.sell.entity.Product;
import com.sell.service.CategoryService;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

<<<<<<< HEAD
    @Autowired
    CategoryImpl categoryImpl;

    @Autowired
    ProductImpl productImpl;
=======
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
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c

    @RequestMapping("/htc")
    public String htc(Model model) {
        categoryService.htc(model);
        return "view/Category";
    }

<<<<<<< HEAD
    @RequestMapping("/iphone")
    public String iphone(Model model) {
        categoryService.iphone(model);
=======
	@RequestMapping("/samsung")
	public String samsung(Model model) {
		categoryService.samsung(model, 1);
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c

        return "view/Category";
    }

<<<<<<< HEAD
    @RequestMapping("/samsung")
    public String samsung(Model model) {
        categoryService.samsung(model);
=======
	@RequestMapping("/nokia")
	public String nokia(Model model) {
		categoryService.nokia(model, 1);
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c

        return "view/Category";
    }

<<<<<<< HEAD
    @RequestMapping("/nokia")
    public String nokia(Model model) {
        categoryService.nokia(model);
=======
	@RequestMapping("/blackberry")
	public String blackberry(Model model) {
		categoryService.blackberry(model, 1);
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c

        return "view/Category";
    }

<<<<<<< HEAD
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

    @RequestMapping("/{category}/{code}-{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productImpl.getProduct(id));
        return "view/show-info";
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
=======
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
	
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c
}
