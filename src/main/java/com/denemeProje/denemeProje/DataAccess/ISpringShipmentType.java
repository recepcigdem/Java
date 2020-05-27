package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Shipmenttype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringShipmentType extends JpaRepository<Shipmenttype,Long> {

    public Shipmenttype findAllByShipmenttypeId(Integer id);
}
