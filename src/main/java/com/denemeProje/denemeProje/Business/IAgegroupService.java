package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Agegroup;

import java.util.List;

public interface IAgegroupService {
    List<Agegroup> getAll();
    void add(Agegroup ageGroup);
    void delete(Agegroup ageGroup);
    void update(Agegroup ageGroup);
    Agegroup getById(int ageGroupId);
}
