package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.dao.interfaces.CategoryDao;
import com.easystartinit.java_oct_16.model.Category;
import com.easystartinit.java_oct_16.service.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private ImageService imageService;

    public List<Category> getAll() {
        return categoryDao.readAll(Category.class);
    }

    @Override
    public Category read(Long id) {
        return categoryDao.read(Category.class, id);
    }

    @Override
    public boolean saveImage(MultipartFile multipartFile, String fileName) {
        return imageService.saveImage(multipartFile, "/home/maxt28/Desktop/externalImages/"+fileName);
    }
}
