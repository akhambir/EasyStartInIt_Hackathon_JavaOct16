package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String getCategoryPage(Model model){
        model.addAttribute("categories", categoryService.getAll());
        return "categories";
    }
}
