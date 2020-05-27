package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Material;

import java.util.List;

public interface IMaterialService {
    List<Material> getAll();
    void add(Material material);
    void delete(Material material);
    void update(Material material);
    Material getById(int materialId);
}
