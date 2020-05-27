package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Shipmenttype;

import java.util.List;

public interface IShipmentTypeService {
    List<Shipmenttype> getAll();
    void add(Shipmenttype shipmenttype);
    void delete(Shipmenttype shipmenttype);
    void update(Shipmenttype shipmenttype);
    Shipmenttype getById(int shipmenttype);
}
