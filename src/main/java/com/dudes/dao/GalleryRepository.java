package com.dudes.dao;

import com.dudes.model.Gallery;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by s.piskunov on 25.05.2016.
 */
public interface GalleryRepository extends PagingAndSortingRepository<Gallery,Long> {

}
