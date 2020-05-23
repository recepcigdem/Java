package com.denemeProje.denemeProje.controller;

import com.denemeProje.denemeProje.Business.IDefinitionService;
import com.denemeProje.denemeProje.Entities.Definition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class DefinitionController {

    private IDefinitionService iDefinitionService;

    @Autowired
    public DefinitionController(IDefinitionService iDefinitionService) {
        this.iDefinitionService = iDefinitionService;
    }
    @GetMapping("/definition")
    public List<Definition> getAll(){
        return iDefinitionService.getAll();
    }
    @PostMapping("/definition/add")
    public void add(@RequestBody Definition definition){
        iDefinitionService.add(definition);
    }
    @PutMapping("/definition/update")
    public void update(@RequestBody Definition definition){
        iDefinitionService.update(definition);
    }

    @PostMapping("/definition/delete")
    public void delete(@RequestBody Definition definition){
        iDefinitionService.delete(definition);
    }

    @GetMapping("/definition/{definitionid}")
    public Definition getById(@PathVariable("definitionid") int definitionid){
        return iDefinitionService.getById(definitionid);
    }

    @GetMapping("/definition/category/{categoryId}")
    public Definition getByCategoryId(@PathVariable("categoryId") int categoryId){
        return iDefinitionService.getByCategoryId(categoryId);
    }
}
