package com.easystartinit.java_oct_16.service.interfaces;

import com.easystartinit.java_oct_16.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    List<Product> getProductsByCategory(String category);

    Product read(Long id);

    Product create(Product product);

    Product edit(Product product);

    Product delete(Product product);

    boolean saveImage(MultipartFile multipartFile, String fileName);

    String getImagesRootPath();
}
