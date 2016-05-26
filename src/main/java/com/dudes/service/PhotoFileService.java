package com.dudes.service;

import org.springframework.beans.factory.annotation.Value;

import java.text.SimpleDateFormat;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 *
 * Service for upload image files
 */
public class PhotoFileService {

    @Value("${attachedfile.path}")
    private String path;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");




}
