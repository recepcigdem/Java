package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Label {
    private int labelId;
    private boolean active;
    private String code;
    private String description;
    private byte[] image;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "label_id")
    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Label label = (Label) o;

        if (labelId != label.labelId) return false;
        if (active != label.active) return false;
        if (code != null ? !code.equals(label.code) : label.code != null) return false;
        if (description != null ? !description.equals(label.description) : label.description != null) return false;
        if (!Arrays.equals(image, label.image)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = labelId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
