package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Staffs;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateStaffsDal implements IStaffsDal {
    private EntityManager entityManager;


    @Autowired
    public HibernateStaffsDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Staffs> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Staffs> staffs = session.createQuery("from Staffs", Staffs.class).getResultList();
        return staffs;
    }

    @Override
    public void add(Staffs staff) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(staff);
    }

    @Override
    public void update(Staffs staff) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(staff);
    }

    @Override
    public void delete(Staffs staff) {
        Session session = entityManager.unwrap(Session.class);
        Staffs staffToDelete = session.get(Staffs.class, staff.getStaffId());
        session.delete(staffToDelete);
    }

    @Override
    public Staffs getById(int staffId) {
        Session session = entityManager.unwrap(Session.class);
        Staffs staff = session.get(Staffs.class, staffId);
        return staff;
    }

    @Override
    public Staffs getByUserName(String userName) {
        Session session = entityManager.unwrap(Session.class);
        Staffs staff = session.get(Staffs.class, userName);
        return staff;
    }
}
