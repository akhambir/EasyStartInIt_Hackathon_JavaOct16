package com.easystartinit.java_oct_16.service.interfaces;

import com.easystartinit.java_oct_16.model.Category;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category create(Category category);

    Category read(Long id);

    boolean saveImage(MultipartFile multipartFile, String fileName);

    String getImagesRootPath();

    Category update(Category category);
}
