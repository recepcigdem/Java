package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;

@Entity
public class Agegroup {
    private int agegroupId;
    private boolean active;
    private String code;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agegroup_id")
    public int getAgegroupId() {
        return agegroupId;
    }

    public void setAgegroupId(int agegroupId) {
        this.agegroupId = agegroupId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agegroup agegroup = (Agegroup) o;

        if (agegroupId != agegroup.agegroupId) return false;
        if (active != agegroup.active) return false;
        if (code != null ? !code.equals(agegroup.code) : agegroup.code != null) return false;
        if (description != null ? !description.equals(agegroup.description) : agegroup.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agegroupId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
