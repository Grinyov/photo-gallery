package com.dudes.service;

import com.dudes.model.Gallery;

/**
 * Created by vgrinyov on 26.05.16.
 */
public interface IGalleryService {

    public Gallery createNewGallery(Gallery gallery);

    public Gallery updateGallery(Gallery origin, Gallery update);

    public void deleteGallery(Gallery Gallery);

}
