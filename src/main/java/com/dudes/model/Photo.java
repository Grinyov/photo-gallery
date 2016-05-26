package com.dudes.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vgrinyov on 23.05.16.
 * <p/>
 * Entity for image in the album
 */
@Entity
public class Photo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Lob
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    private ImageFile image;

    public Photo(String title, ImageFile image) {
        setTitle(title);
        setImage(image);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageFile getImage() {
        return image;
    }

    public void setImage(ImageFile image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        if (id != photo.id) return false;
        if (title != null ? !title.equals(photo.title) : photo.title != null) return false;
        return image.equals(photo.image);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + image.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image=" + image +
                '}';
    }
}
