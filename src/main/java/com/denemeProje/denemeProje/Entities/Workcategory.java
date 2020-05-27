package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;

@Entity
public class Workcategory {
    private int workcategoryId;
    private boolean active;
    private String code;
    private String description;
    private boolean garmentcontrol;
    private boolean accessorycontrol;
    private boolean decorationcontrol;
    private int kdv;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workcategory_id")
    public int getWorkcategoryId() {
        return workcategoryId;
    }

    public void setWorkcategoryId(int workcategoryId) {
        this.workcategoryId = workcategoryId;
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
    @Column(name = "garmentcontrol")
    public boolean isGarmentcontrol() {
        return garmentcontrol;
    }

    public void setGarmentcontrol(boolean garmentcontrol) {
        this.garmentcontrol = garmentcontrol;
    }

    @Basic
    @Column(name = "accessorycontrol")
    public boolean isAccessorycontrol() {
        return accessorycontrol;
    }

    public void setAccessorycontrol(boolean accessorycontrol) {
        this.accessorycontrol = accessorycontrol;
    }

    @Basic
    @Column(name = "decorationcontrol")
    public boolean isDecorationcontrol() {
        return decorationcontrol;
    }

    public void setDecorationcontrol(boolean decorationcontrol) {
        this.decorationcontrol = decorationcontrol;
    }

    @Basic
    @Column(name = "kdv")
    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Workcategory that = (Workcategory) o;

        if (workcategoryId != that.workcategoryId) return false;
        if (active != that.active) return false;
        if (garmentcontrol != that.garmentcontrol) return false;
        if (accessorycontrol != that.accessorycontrol) return false;
        if (decorationcontrol != that.decorationcontrol) return false;
        if (kdv != that.kdv) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workcategoryId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (garmentcontrol ? 1 : 0);
        result = 31 * result + (accessorycontrol ? 1 : 0);
        result = 31 * result + (decorationcontrol ? 1 : 0);
        result = 31 * result + kdv;
        return result;
    }
}
