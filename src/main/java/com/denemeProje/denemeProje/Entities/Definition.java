package com.denemeProje.denemeProje.Entities;

import javax.persistence.*;

@Entity
public class Definition {
    private int definitionId;
    private boolean active;
    private String code;
    private String descriptionTr;
    private String descriptionEn;
    private int categoryId;
    private Integer kdv;
    private Integer category;
    private Integer productGroup;

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
    @Column(name = "description_tr")
    public String getDescriptionTr() {
        return descriptionTr;
    }

    public void setDescriptionTr(String descriptionTr) {
        this.descriptionTr = descriptionTr;
    }

    @Basic
    @Column(name = "description_en")
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
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
    @Column(name = "kdv")
    public Integer getKdv() {
        return kdv;
    }

    public void setKdv(Integer kdv) {
        this.kdv = kdv;
    }

    @Basic
    @Column(name = "category")
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Basic
    @Column(name = "product_group")
    public Integer getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(Integer productGroup) {
        this.productGroup = productGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Definition that = (Definition) o;

        if (definitionId != that.definitionId) return false;
        if (active != that.active) return false;
        if (categoryId != that.categoryId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (descriptionTr != null ? !descriptionTr.equals(that.descriptionTr) : that.descriptionTr != null)
            return false;
        if (descriptionEn != null ? !descriptionEn.equals(that.descriptionEn) : that.descriptionEn != null)
            return false;
        if (kdv != null ? !kdv.equals(that.kdv) : that.kdv != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (productGroup != null ? !productGroup.equals(that.productGroup) : that.productGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = definitionId;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (descriptionTr != null ? descriptionTr.hashCode() : 0);
        result = 31 * result + (descriptionEn != null ? descriptionEn.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (kdv != null ? kdv.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (productGroup != null ? productGroup.hashCode() : 0);
        return result;
    }
}
