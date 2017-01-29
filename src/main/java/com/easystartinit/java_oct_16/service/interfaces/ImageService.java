package com.easystartinit.java_oct_16.service.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    String generateName(String product, String imageName);

    boolean saveImage(MultipartFile multipartFile, String filePath);

    String getImagesRootPath();

}
