package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.model.Category;
import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String getCategoryPage(Model model){
        model.addAttribute("categories", categoryService.getAll());
        return "categories";
    }

    @RequestMapping(value = "/createcategory")
    public String getCreateCategoryPage(){
        return "addCategory";
    }

    @RequestMapping(value = "/createcategory/add", method = RequestMethod.POST)
    public String createCategory(@RequestParam(value = "categoryName") String name,
                                 @RequestParam(value = "description") String description, Model model) {
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        model.addAttribute("categoryName", categoryService.create(category));
        model.addAttribute("message", "Category is created successful");
        return "addCategory";
    }

}
