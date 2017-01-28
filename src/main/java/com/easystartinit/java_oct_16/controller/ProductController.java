package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import com.easystartinit.java_oct_16.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProductPage(Model model){
        model.addAttribute("products", productService.getAll());
        model.addAttribute("categories", categoryService.getAll());
        return "products";
    }
}
