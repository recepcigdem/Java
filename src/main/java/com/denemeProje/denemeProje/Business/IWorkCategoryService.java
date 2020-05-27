package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Workcategory;

import java.util.List;

public interface IWorkCategoryService {

    List<Workcategory> getAll();
    void add(Workcategory workcategory);
    void update(Workcategory workcategory);
    void delete(Workcategory workcategory);
    Workcategory getById(int workCategoryId);
}
