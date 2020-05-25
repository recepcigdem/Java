package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;

@Entity
public class Trademark {
    private int trademarkId;
    private String code;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trademark_id")
    public int getTrademarkId() {
        return trademarkId;
    }

    public void setTrademarkId(int trademarkId) {
        this.trademarkId = trademarkId;
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

        Trademark trademark = (Trademark) o;

        if (trademarkId != trademark.trademarkId) return false;
        if (code != null ? !code.equals(trademark.code) : trademark.code != null) return false;
        if (description != null ? !description.equals(trademark.description) : trademark.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trademarkId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
