package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.IMaterialService;
import com.denemeProje.denemeProje.Entities.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MaterialController {

    private IMaterialService iMaterialService;

    @Autowired
    public MaterialController(IMaterialService iMaterialService) {
        this.iMaterialService = iMaterialService;
    }


    @GetMapping("/material")
    public List<Material> getAll() {
        return iMaterialService.getAll();

    }
    @PostMapping("/material/add")
    public void add(@RequestBody Material material) {
        iMaterialService.add(material);
    }

    @PutMapping("/material/update")
    public void update(@RequestBody Material material) {
        iMaterialService.update(material);
    }

    @PostMapping("/material/delete")
    public void delete(@RequestBody Material material) {
        iMaterialService.delete(material);
    }

    @GetMapping("/material/{id}")
    public Material getById(@PathVariable int id) {
        return iMaterialService.getById(id);
    }
}
