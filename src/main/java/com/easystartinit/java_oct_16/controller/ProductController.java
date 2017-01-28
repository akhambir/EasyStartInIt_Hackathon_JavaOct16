package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.service.CategoryServiceImpl;
import com.easystartinit.java_oct_16.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProductsPage(Model model) {
        model.addAttribute("products", productService.getAll());
        model.addAttribute("categories", categoryService.getAll());
        return "products";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String getProductPage(@RequestParam Model model) {

        model.addAttribute("products", productService.getAll());
        model.addAttribute("product", );

        return "product";
    }
}

