package com.dudes.dao;

import com.dudes.model.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by s.piskunov on 25.05.2016.
 */
public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}
