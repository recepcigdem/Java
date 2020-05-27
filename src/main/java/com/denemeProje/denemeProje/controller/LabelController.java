package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.ILabelService;
import com.denemeProje.denemeProje.Entities.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LabelController {

    private ILabelService iLabelService;

    @Autowired
    public LabelController(ILabelService iLabelService) {
        this.iLabelService = iLabelService;
    }

    @GetMapping("/label")
    public List<Label> getAll(){
        return this.iLabelService.getAll();
    }
    @PostMapping("/label/add")
    public void add(@RequestBody Label label){
        this.iLabelService.add(label);
    }
    @PutMapping("/label/update")
    public void update(@RequestBody Label label){
        this.iLabelService.update(label);
    }
    @PostMapping("/label/delete")
    public void delete(@RequestBody Label label){
        this.iLabelService.delete(label);
    }

    @GetMapping("/label/{id}")
    public Label getById(@PathVariable int id){
        return this.iLabelService.getById(id);
    }
}
