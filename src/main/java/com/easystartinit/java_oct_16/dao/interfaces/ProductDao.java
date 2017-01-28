package com.easystartinit.java_oct_16.dao.interfaces;

import com.easystartinit.java_oct_16.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProductsByCategory(String category);
}
