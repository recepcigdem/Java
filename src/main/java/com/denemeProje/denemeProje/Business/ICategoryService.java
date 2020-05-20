package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> getAll();
    void add(Category category);
    void delete(Category category);
    void update(Category category);
    Category getById(int categoryId);
}
