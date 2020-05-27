package com.denemeProje.denemeProje.controller;

import com.denemeProje.denemeProje.Business.IShipmentTypeService;
import com.denemeProje.denemeProje.Entities.Shipmenttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShipmentTypeController {

    private IShipmentTypeService iShipmentTypeService;

    @Autowired
    public ShipmentTypeController(IShipmentTypeService iShipmentTypeService) {
        this.iShipmentTypeService = iShipmentTypeService;
    }
    @GetMapping("/shipmenttype")
    public List<Shipmenttype> getAll(){
        return this.iShipmentTypeService.getAll();
    }

    @PostMapping("/shipmenttype/add")
    public void add(@RequestBody Shipmenttype shipmenttype){
        this.iShipmentTypeService.add(shipmenttype);
    }

    @PutMapping("/shipmenttype/update")
    public void update(@RequestBody Shipmenttype shipmenttype){
        this.iShipmentTypeService.update(shipmenttype);
    }

    @PostMapping("/shipmenttype/delete")
    public void delete(@RequestBody Shipmenttype shipmenttype){
        this.iShipmentTypeService.delete(shipmenttype);
    }

    @GetMapping("/shipmenttype/{id}")
    public Shipmenttype getById(@PathVariable int id){
        return this.iShipmentTypeService.getById(id);
    }

}
