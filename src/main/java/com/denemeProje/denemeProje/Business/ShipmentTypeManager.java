package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringShipmentType;
import com.denemeProje.denemeProje.Entities.Shipmenttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ShipmentTypeManager implements IShipmentTypeService{

    private ISpringShipmentType iSpringShipmentType;

    @Autowired
    public ShipmentTypeManager(ISpringShipmentType iSpringShipmentType) {
        this.iSpringShipmentType = iSpringShipmentType;
    }

    @Override
    @Transactional
    public List<Shipmenttype> getAll() {
        return this.iSpringShipmentType.findAll();
    }

    @Override
    public void add(Shipmenttype shipmenttype) {
        this.iSpringShipmentType.save(shipmenttype);
    }

    @Override
    public void delete(Shipmenttype shipmenttype) {
        this.iSpringShipmentType.delete(shipmenttype);
    }

    @Override
    public void update(Shipmenttype shipmenttype) {
        this.iSpringShipmentType.save(shipmenttype);
    }

    @Override
    public Shipmenttype getById(int shipmenttypeid) {
        return this.iSpringShipmentType.findAllByShipmenttypeId(shipmenttypeid);
    }
}
