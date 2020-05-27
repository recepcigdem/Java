package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringMaterial extends JpaRepository<Material,Long> {

    public Material findAllByMaterialId(Integer id);
}
