package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Shipmenttype {
    private int shipmenttypeId;
    private boolean active;
    private Date date;
    private String code;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipmenttype_id")
    public int getShipmenttypeId() {
        return shipmenttypeId;
    }

    public void setShipmenttypeId(int shipmenttypeId) {
        this.shipmenttypeId = shipmenttypeId;
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
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shipmenttype that = (Shipmenttype) o;

        if (shipmenttypeId != that.shipmenttypeId) return false;
        if (active != that.active) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmenttypeId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
