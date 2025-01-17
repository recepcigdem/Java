package com.denemeProje.denemeProje.controller;

import com.denemeProje.denemeProje.Business.IStaffsService;
import com.denemeProje.denemeProje.Entities.Staffs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StaffsController {


    private final IStaffsService staffService;

    @Autowired
    public StaffsController(IStaffsService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/staffs")
    public List<Staffs> getAll() {
        return staffService.getAll();

    }
    @PostMapping("/staffs/add")
    public void add(@RequestBody Staffs staff) {
        staffService.add(staff);
    }

    @PutMapping("/staffs/update")
    public void update(@RequestBody Staffs staff) {
        staffService.update(staff);
    }

    @PostMapping("/staffs/delete")
    public void delete(@RequestBody Staffs staff) {
        staffService.delete(staff);
    }

    @GetMapping("/staffs/{id}")
    public Staffs getById(@PathVariable int id) {
        return staffService.getById(id);
    }

//    @GetMapping("/staffs/{userName}")
//    public Staffs getByUserName(@PathVariable("userName") String userName) {
//        return staffService.getByUserName(userName);
//    }
}
