package com.dudes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 *
 * Entity for assigning image file
 */
@Entity
public class ImageFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String file;

    private String type;

    private String path;

    private long size = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageFile imageFile = (ImageFile) o;

        if (size != imageFile.size) return false;
        if (!id.equals(imageFile.id)) return false;
        if (!name.equals(imageFile.name)) return false;
        if (file != null ? !file.equals(imageFile.file) : imageFile.file != null) return false;
        if (type != null ? !type.equals(imageFile.type) : imageFile.type != null) return false;
        return path.equals(imageFile.path);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + path.hashCode();
        result = 31 * result + (int) (size ^ (size >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ImageFile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", type='" + type + '\'' +
                ", path='" + path + '\'' +
                ", size=" + size +
                '}';
    }
}
