package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.dao.interfaces.ProductDao;
import com.easystartinit.java_oct_16.model.Product;
import com.easystartinit.java_oct_16.service.interfaces.ImageService;
import com.easystartinit.java_oct_16.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static final String FOLDER_PATH = "products/";

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ImageService imageService;

    public List<Product> getAll() {
        return productDao.readAll(Product.class);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productDao.getProductsByCategory(category);
    }

    @Override
    public Product read(Long id) {
        return productDao.read(Product.class, id);
    }

    @Override
    public Product create(Product product) {
        return productDao.create(product);
    }

    @Override
    public Product edit(Product product) {
        return productDao.update(product);
    }

    @Override
    public Product delete(Product product) {
        return productDao.delete(product);
    }

    @Override
    public boolean saveImage(MultipartFile multipartFile, String fileName) {
        return imageService.saveImage(multipartFile,  FOLDER_PATH + fileName);
    }

    public String getImagesRootPath(){
        return imageService.getImagesRootPath() + FOLDER_PATH;
    }

    @Override
    public List<Product> getUserProducts(String userName) {
        return productDao.getUserProducts(userName);
    }


}
