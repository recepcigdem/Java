package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Paymentmethod {
    private int paymentmethodId;
    private boolean active;
    private Date date;
    private String description;
    private int kkdf;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentmethod_id")
    public int getPaymentmethodId() {
        return paymentmethodId;
    }

    public void setPaymentmethodId(int paymentmethodId) {
        this.paymentmethodId = paymentmethodId;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "kkdf")
    public int getKkdf() {
        return kkdf;
    }

    public void setKkdf(int kkdf) {
        this.kkdf = kkdf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paymentmethod that = (Paymentmethod) o;

        if (paymentmethodId != that.paymentmethodId) return false;
        if (active != that.active) return false;
        if (kkdf != that.kkdf) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentmethodId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + kkdf;
        return result;
    }
}
