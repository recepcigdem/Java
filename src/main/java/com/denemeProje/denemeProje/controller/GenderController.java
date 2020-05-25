package com.denemeProje.denemeProje.controller;

import com.denemeProje.denemeProje.Business.IGenderService;
import com.denemeProje.denemeProje.Entities.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GenderController {
    private IGenderService iGenderService;

    @Autowired
    public GenderController(IGenderService iGenderService) {
        this.iGenderService = iGenderService;
    }
    @GetMapping("/gender")
    public List<Gender> getAll(){
        return iGenderService.getAll();
    }

    @PostMapping("/gender/add")
    public void add(@RequestBody Gender gender){
        iGenderService.add(gender);
    }
    @PutMapping("/gender/update")
    public void update(@RequestBody Gender gender){
        iGenderService.update(gender);
    }
    @PostMapping("/gender/delete")
    public void delete(@RequestBody Gender gender){
        iGenderService.delete(gender);
    }
    @GetMapping("/gender/{categoryid}")
    public Gender getById(@PathVariable int genderId){
        return iGenderService.getById(genderId);
    }
}
