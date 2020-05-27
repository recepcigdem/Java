package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.ITradeMarkService;
import com.denemeProje.denemeProje.Entities.Trademark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrandeMarkController {
    private ITradeMarkService iTradeMarkService;

    @Autowired
    public TrandeMarkController(ITradeMarkService iTradeMarkService) {
        this.iTradeMarkService = iTradeMarkService;
    }

    @GetMapping("/trademark")
    public List<Trademark> getAll() {
        return iTradeMarkService.getAll();

    }
    @PostMapping("/trademark/add")
    public void add(@RequestBody Trademark trademark) {
        iTradeMarkService.add(trademark);
    }

    @PutMapping("/trademark/update")
    public void update(@RequestBody Trademark trademark) {
        iTradeMarkService.update(trademark);
    }

    @PostMapping("/trademark/delete")
    public void delete(@RequestBody Trademark trademark) {
        iTradeMarkService.delete(trademark);
    }

    @GetMapping("/trademark/{id}")
    public Trademark getById(@PathVariable int id) {
        return iTradeMarkService.getById(id);
    }
}
