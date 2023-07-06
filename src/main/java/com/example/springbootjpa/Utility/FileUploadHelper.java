package com.example.springbootjpa.Utility;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {
 //   public final String Upload_Dir="I:\\practise java\\spring-boot-jpa\\src\\main\\resources\\static\\image";
    public final String Upload_Dir=new ClassPathResource("static/image").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException {
    }

    public boolean uploadFile(MultipartFile file){
        boolean f= false;
        try{
            Files.copy(file.getInputStream(), Paths.get(Upload_Dir+ File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
