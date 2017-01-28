package com.easystartinit.java_oct_16.service.interfaces;

import com.easystartinit.java_oct_16.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    List<Product> getProductByCategory(String category);

}
