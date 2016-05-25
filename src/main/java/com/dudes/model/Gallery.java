package com.dudes.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by s.piskunov on 25.05.2016.
 */
@Entity
@Table(name = "gallery")
public class Gallery {

    @Id
    @GeneratedValue
    Long id;

    @Autowired
    Photo photo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gallery)) return false;

        Gallery gallery = (Gallery) o;

        if (getId() != null ? !getId().equals(gallery.getId()) : gallery.getId() != null) return false;
        return getPhoto() != null ? getPhoto().equals(gallery.getPhoto()) : gallery.getPhoto() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getPhoto() != null ? getPhoto().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "id=" + id +
                ", photo=" + photo +
                '}';
    }
}
