package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.model.Category;
import com.easystartinit.java_oct_16.model.Product;
import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import com.easystartinit.java_oct_16.service.interfaces.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/categories/update")
    public ModelAndView getUpdateCategoryPage(@RequestParam(value = "category_id") Long id) {
        ModelAndView model = new ModelAndView("updateCategory");
        Category category = categoryService.read(id);
        model.addObject("category", category);
        System.out.println(category.getId());
        System.out.println(category.getName());
        System.out.println(category.getDescription());
        return model;
    }

    @RequestMapping(value = "/categories/update", method = RequestMethod.POST)
    public ModelAndView updateCategory(@RequestParam(value = "name") String name,
                                       @RequestParam(value = "description") String description,
                                       @RequestParam(value = "category_id") Long id,
                                       @RequestParam(value = "image") MultipartFile multipartFile) {
        Category category = categoryService.read(id);
        ModelAndView model = new ModelAndView("categories");
        category.setName(name);
        category.setDescription(description);
        if (multipartFile != null) {
            String fileName = imageService.generateName(name, multipartFile.getOriginalFilename());
            categoryService.saveImage(multipartFile, fileName);
            category.setImage(fileName);
        }
        categoryService.update(category);
        return model;
    }

    @RequestMapping(value = "/createcategory/delete", method = RequestMethod.POST)
    public String deleteCategory(@RequestParam(value = "categoryId") Long categoryId, Model model) {
        model.addAttribute("message", "Category " + categoryId + "deleted");
        categoryService.delete(categoryService.read(categoryId));
        return "categories";
    }

}
