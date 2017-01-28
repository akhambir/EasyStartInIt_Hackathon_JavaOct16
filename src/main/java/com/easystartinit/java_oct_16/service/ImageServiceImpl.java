package com.easystartinit.java_oct_16.service;

import com.easystartinit.java_oct_16.service.interfaces.ImageService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public String generateName(String product, String imageName) {
        return product + "_" + System.currentTimeMillis() + "_" + imageName;
    }

    @Override
    public boolean saveImage(MultipartFile multipartFile, String filePath) {
        Properties properties = new Properties();
        String rootPath = null;
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/../application.properties");
            properties.load(inputStream);
            rootPath = properties.getProperty("external-root-path");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            byte[] bytes = multipartFile.getBytes();
            FileUtils.writeByteArrayToFile(new File(rootPath+filePath), bytes);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
