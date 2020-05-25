package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.IAgegroupService;
import com.denemeProje.denemeProje.Entities.Agegroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AgegroupController {

    private IAgegroupService iAgegroupService;

    @Autowired
    public AgegroupController(IAgegroupService iAgegroupService) {
        this.iAgegroupService = iAgegroupService;
    }
    @GetMapping("/agegroup")
    public List<Agegroup> getAll(){
        return iAgegroupService.getAll();
    }

    @PostMapping("/agegroup/add")
    public void add(@RequestBody Agegroup ageGroup){
        iAgegroupService.add(ageGroup);
    }
    @PutMapping("/agegroup/update")
    public void update(@RequestBody Agegroup ageGroup){
        iAgegroupService.update(ageGroup);
    }
    @PostMapping("/agegroup/delete")
    public void delete(@RequestBody Agegroup ageGroup){
        iAgegroupService.delete(ageGroup);
    }
    @GetMapping("/agegroup/{agegroupid}")
    public Agegroup getById(@PathVariable int agegroupId){
        return iAgegroupService.getById(agegroupId);
    }
}
