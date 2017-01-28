package com.easystartinit.java_oct_16.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    String generateName(String product, String imageName);

    boolean saveImage(MultipartFile multipartFile, String filePath);
}
