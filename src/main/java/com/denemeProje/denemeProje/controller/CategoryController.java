package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.ICategoryService;
import com.denemeProje.denemeProje.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    private ICategoryService iCategoryService;

    @Autowired
    public CategoryController(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }
    @GetMapping("/category")
    public List<Category> getAll(){
        return iCategoryService.getAll();
    }

    @PostMapping("/category/add")
    public void add(@RequestBody Category category){
        iCategoryService.add(category);
    }
    @PutMapping("/category/update")
    public void update(@RequestBody Category category){
        iCategoryService.update(category);
    }
    @PostMapping("/category/delete")
    public void delete(@RequestBody Category category){
        iCategoryService.delete(category);
    }
    @GetMapping("/category/{categoryid}")
    public Category getById(@PathVariable int categoryid){
        return iCategoryService.getById(categoryid);
    }
}
