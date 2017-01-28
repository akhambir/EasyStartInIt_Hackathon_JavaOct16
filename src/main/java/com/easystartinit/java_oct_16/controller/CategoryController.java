package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.model.Category;
import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import com.easystartinit.java_oct_16.service.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ImageService imageService;

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
    public String createCategory(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "description") String description,
                                 @RequestParam(value = "image") MultipartFile multipartFile, Model model) {
        String fileName = imageService.generateName(name, multipartFile.getOriginalFilename());
        categoryService.saveImage(multipartFile, fileName);
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        category.setImage(fileName);
        model.addAttribute("categoryName", categoryService.create(category));
        model.addAttribute("message", "Category is created successful");
        return "addCategory";
    }

}
