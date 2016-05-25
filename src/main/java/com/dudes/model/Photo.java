package com.dudes.model;

/**
 * Created by vgrinyov on 23.05.16.
 */
public class Photo {

    private long id;

    public Photo() {
    }

    public Photo(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
