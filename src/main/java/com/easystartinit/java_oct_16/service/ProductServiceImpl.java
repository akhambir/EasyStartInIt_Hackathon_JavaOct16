package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.dao.interfaces.ProductDao;
import com.easystartinit.java_oct_16.model.Product;
import com.easystartinit.java_oct_16.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAll() {
        return productDao.readAll(Product.class);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productDao.getProductsByCategory(category);
    }


}
