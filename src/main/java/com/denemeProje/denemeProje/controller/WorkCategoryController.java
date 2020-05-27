package com.denemeProje.denemeProje.controller;

import com.denemeProje.denemeProje.Business.IWorkCategoryService;
import com.denemeProje.denemeProje.Entities.Workcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkCategoryController {

    private IWorkCategoryService iWorkCategoryService;

    @Autowired
    public WorkCategoryController(IWorkCategoryService iWorkCategoryService) {
        this.iWorkCategoryService = iWorkCategoryService;
    }

    @GetMapping("/workcategory")
    public List<Workcategory> getAll() {
        return iWorkCategoryService.getAll();

    }
    @PostMapping("/workcategory/add")
    public void add(@RequestBody Workcategory workcategory) {
        iWorkCategoryService.add(workcategory);
    }

    @PutMapping("/workcategory/update")
    public void update(@RequestBody Workcategory workcategory) {
        iWorkCategoryService.update(workcategory);
    }

    @PostMapping("/workcategory/delete")
    public void delete(@RequestBody Workcategory workcategory) {
        iWorkCategoryService.delete(workcategory);
    }

    @GetMapping("/workcategory/{id}")
    public Workcategory getById(@PathVariable int id) {
        return iWorkCategoryService.getById(id);
    }
}
