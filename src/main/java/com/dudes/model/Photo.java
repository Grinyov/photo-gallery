package com.dudes.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vgrinyov on 23.05.16.
 */
@Entity
public class Photo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Lob
    private String image;

    public Photo() {
    }

    public Photo(long id, String image) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
