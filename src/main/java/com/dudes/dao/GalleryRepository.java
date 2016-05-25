package com.dudes.dao;

import com.dudes.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

/**
 * Created by s.piskunov on 25.05.2016.
 */
public interface GalleryRepository extends JpaRepository<Id,Photo> {
    Photo findByPhotoId(Long photoId);
    void save(Long photoId, Photo Photo);
}
