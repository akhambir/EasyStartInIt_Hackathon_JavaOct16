package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import com.easystartinit.java_oct_16.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProductsPage(@RequestParam("category") String category, Model model) {
        model.addAttribute("products", productService.getProductsByCategory(category));
        model.addAttribute("categories", categoryService.getAll());
        model.addAttribute("currentCategory", category);
        return "products";
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String getProductPage(@RequestParam("id") String id,
                                 @RequestParam("category") String category,
                                 Model model) {
        model.addAttribute("products", productService.getProductsByCategory(category));
        model.addAttribute("product", productService.read(Integer.valueOf(id)));
        return "product";
    }
}

