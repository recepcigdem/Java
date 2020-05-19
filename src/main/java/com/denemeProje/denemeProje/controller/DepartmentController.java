package com.denemeProje.denemeProje.controller;

import com.denemeProje.denemeProje.Business.IDepartmentService;
import com.denemeProje.denemeProje.Entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    private IDepartmentService iDepartmentService;

    @Autowired
    public DepartmentController(IDepartmentService iDepartmentService) {
        this.iDepartmentService = iDepartmentService;
    }
    @GetMapping("/department")
    public List<Department> getAll(){
        return iDepartmentService.getAll();
    }
    @PostMapping("/department/add")
    public void add(@RequestBody Department department){
        this.iDepartmentService.add(department);
    }

    @PutMapping("/department/update")
    public void update(@RequestBody Department department){
        this.iDepartmentService.update(department);
    }

    @PostMapping("/department/delete")
    public void delete(@RequestBody Department department){
        this.iDepartmentService.delete(department);
    }

    @GetMapping("/department/{departmentId}")
    public Department getById(@PathVariable int departmentId){
        return iDepartmentService.getById(departmentId);
    }
}
