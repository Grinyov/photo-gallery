package com.dudes.service;

import com.dudes.exception.FileUploadException;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 * <p/>
 * Service for upload image files
 */
public class PhotoFileService {

    @Value("${attachedfile.path}")
    private String path;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");





    private File createFile() {
        try {
            String savePath = createSavePath();
            String saveFileName = UUID.randomUUID().toString();

            File saveFile = new File(path + savePath + saveFileName);
            if (saveFile.exists())
                return createFile();

            // creating photo
            return saveFile;

        } catch (Exception e) {
            throw new FileUploadException("Failed to upload files", e);
        }
    }



}
