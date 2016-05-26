package com.dudes.service;

import com.dudes.exception.FileUploadException;
import com.dudes.model.ImageFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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


    public ImageFile saveFileToStorage(String fileName, String contentType, InputStream inputStream) throws IOException {
        File saveFile = createFile();

        ImageFile file = new ImageFile();

        file.setName(fileName);
        file.setType(contentType);

        FileCopyUtils.copy(inputStream, new FileOutputStream(saveFile));

        file.setPath(saveFile.getPath());
        file.setSize(saveFile.length());
        file.setFile(saveFile.getName());

        return file;
    }


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

    private String createSavePath() {
        String savePath = dateFormat.format(Calendar.getInstance().getTime()) + File.separator;

        File saveDir = new File(path + savePath);
        if (!saveDir.exists())
            saveDir.mkdir();

        return savePath;
    }

}
