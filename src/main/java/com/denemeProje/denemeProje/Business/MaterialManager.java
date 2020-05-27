package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringMaterial;
import com.denemeProje.denemeProje.Entities.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MaterialManager implements IMaterialService{

    private ISpringMaterial iSpringMaterial;

    @Autowired
    public MaterialManager(ISpringMaterial iSpringMaterial) {
        this.iSpringMaterial = iSpringMaterial;
    }

    @Override
    @Transactional
    public List<Material> getAll() {
        return this.iSpringMaterial.findAll();
    }

    @Override
    public void add(Material material) {
        this.iSpringMaterial.save(material);
    }

    @Override
    public void delete(Material material) {
        this.iSpringMaterial.delete(material);
    }

    @Override
    public void update(Material material) {
        this.iSpringMaterial.save(material);
    }

    @Override
    public Material getById(int materialId) {
        return this.iSpringMaterial.findAllByMaterialId(materialId);
    }
}
