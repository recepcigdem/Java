package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;

@Entity
public class Definition {
    private int definitionId;
    private String description;
    private int categoryId;
    private Integer value1;
    private Integer value2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "definition_id")
    public int getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(int definitionId) {
        this.definitionId = definitionId;
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
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "value1")
    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    @Basic
    @Column(name = "value2")
    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Definition that = (Definition) o;

        if (definitionId != that.definitionId) return false;
        if (categoryId != that.categoryId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (value1 != null ? !value1.equals(that.value1) : that.value1 != null) return false;
        if (value2 != null ? !value2.equals(that.value2) : that.value2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = definitionId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (value1 != null ? value1.hashCode() : 0);
        result = 31 * result + (value2 != null ? value2.hashCode() : 0);
        return result;
    }
}
