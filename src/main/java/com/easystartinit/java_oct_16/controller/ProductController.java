package com.easystartinit.java_oct_16.controller;

import com.easystartinit.java_oct_16.model.Product;
import com.easystartinit.java_oct_16.service.interfaces.ImageService;
import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import com.easystartinit.java_oct_16.service.interfaces.ProductService;
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
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ImageService imageService;

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
        model.addAttribute("product", productService.read(Long.valueOf(id)));
        return "product";
    }

    @RequestMapping(value = "/addProduct")
    public ModelAndView getAddProductPage() {
        ModelAndView model = new ModelAndView("addProduct");
        model.addObject("categories", categoryService.getAll());
        return model;
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public ModelAndView sendAddProductForm(@RequestParam("name") String name,
                                           @RequestParam("description") String description,
                                           @RequestParam("price") Double price,
                                           @RequestParam("category.id") Long id,
                                           @RequestParam("image") MultipartFile multipartFile) {
        ModelAndView model = new ModelAndView("addProduct");
        model.addObject("message", "New Product " + name + " Added");
        Product product = new Product();
        String fileName = imageService.generateName(name, multipartFile.getOriginalFilename());
        productService.saveImage(multipartFile, fileName);
        product.setCategory(categoryService.read(id));
        product.setName(name);
        product.setImage(fileName);
        product.setDescription(description);
        product.setPrice(price);
        productService.create(product);
        model.addObject("categories", categoryService.getAll());
        return model;
    }

    @RequestMapping(value = "/products/delete", method = RequestMethod.POST)
    public String deleteProduct(@RequestParam(value = "productId") Long productId, Model model) {
        String productMessage = productService.delete(productService.read(productId)).getName();
        model.addAttribute("message", "Product " + productMessage + " deleted");
        return "products";
    }

    @RequestMapping(value = "/products/edit", method = RequestMethod.GET)
    public ModelAndView editProduct(@RequestParam(value = "productId") Long productId) {
        ModelAndView model = new ModelAndView("editProduct");
        Product product = productService.read(productId);
        model.addObject("product", product);
        model.addObject("category", categoryService.getAll());
        return model;
    }

    @RequestMapping(value = "/products/edit/update", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute(value = "product") Product product,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "description") String description,
                                @RequestParam(value = "price") Double price,
                                @RequestParam(value = "category.id") Long id,
                                @RequestParam(value = "image") MultipartFile multipartFile) {
        String fileName = imageService.generateName(name, multipartFile.getOriginalFilename());
        productService.saveImage(multipartFile, fileName);
        product.setCategory(categoryService.read(id));
        product.setName(name);
        product.setImage(fileName);
        product.setDescription(description);
        product.setPrice(price);
        productService.edit(product);
        return "products";
    }

}

