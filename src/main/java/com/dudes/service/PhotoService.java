package com.dudes.service;

import com.dudes.dao.PhotoRepository;
import com.dudes.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 */
@Service
@Transactional
public class PhotoService implements IPhotoService {

    @Autowired
    private PhotoRepository repository;

    @Override
    public Photo createNewPhoto(Photo photo) {
        return repository.save(photo);
    }

}
