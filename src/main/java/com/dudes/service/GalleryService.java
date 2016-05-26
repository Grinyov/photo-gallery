package com.dudes.service;

import com.dudes.dao.GalleryRepository;
import com.dudes.model.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * Created by vgrinyov on 26.05.16.
 */
@Service
@Transactional
public class GalleryService implements IGalleryRepository {

    @Autowired
    private GalleryRepository repository;


    public Gallery createNewGallery(Gallery gallery) {
        return repository.save(gallery);
    }


    public Gallery updateGallery(Gallery origin, Gallery update) {
        if (origin == null) {
            throw new RuntimeException();
        }

        if (StringUtils.hasText(update.getTitle())) {
            origin.setTitle(update.getTitle());
        }

        if (StringUtils.hasText(update.getContent())) {
            origin.setContent(update.getContent());
        }

        return repository.save(origin);
    }

    public void deleteGallery(Gallery gallery) {
        if (gallery == null) {
            throw new RuntimeException();
        }

        repository.delete(gallery);
    }

}
