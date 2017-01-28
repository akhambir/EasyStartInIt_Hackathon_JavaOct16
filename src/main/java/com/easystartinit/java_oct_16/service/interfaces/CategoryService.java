package com.easystartinit.java_oct_16.service.interfaces;

import com.easystartinit.java_oct_16.model.Category;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

<<<<<<< HEAD
    Category create(Category category);
=======
    Category read(Long id);

    boolean saveImage(MultipartFile multipartFile, String fileName);
>>>>>>> 613ae085f4f55887a41f31cd653d48429f24f8bd
}
