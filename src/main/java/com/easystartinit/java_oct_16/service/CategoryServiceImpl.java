package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.dao.interfaces.CategoryDao;
import com.easystartinit.java_oct_16.model.Category;
import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getAll() {
        return categoryDao.readAll(Category.class);
    }

    public Category create(Category category) {
        return categoryDao.create(category);
    }

}
