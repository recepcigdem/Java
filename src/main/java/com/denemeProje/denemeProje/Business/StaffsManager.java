package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.IStaffsDal;
import com.denemeProje.denemeProje.Entities.Staffs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StaffsManager implements IStaffsService{
    private IStaffsDal iStaffsDal;
    @Autowired
    public StaffsManager(IStaffsDal staffsDal){
        this.iStaffsDal=staffsDal;
    }

    @Override
    @Transactional
    public List<Staffs> getAll() {
        return this.iStaffsDal.getAll();
    }

    @Override
    public void add(Staffs staff) {
    this.iStaffsDal.add(staff);
    }

    @Override
    public void update(Staffs staff) {
        this.iStaffsDal.update(staff);
    }

    @Override
    public void delete(Staffs staff) {
        this.iStaffsDal.delete(staff);
    }

    @Override
    public Staffs getById(int staffId) {
        return this.iStaffsDal.getById(staffId);
    }

    @Override
    public Staffs getByUserName(String userName) {
        return this.iStaffsDal.getByUserName(userName);
    }
}
