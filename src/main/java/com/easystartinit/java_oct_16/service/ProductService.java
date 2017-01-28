package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.dao.ProductDao;
import com.easystartinit.java_oct_16.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAll() {
        return productDao.readAll(Product.class);
    }
}
