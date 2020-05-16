package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringStaffs;
import com.denemeProje.denemeProje.Entities.Staffs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StaffsManager implements IStaffsService{
    private ISpringStaffs iSpringStaffs;

    @Autowired
    public StaffsManager(ISpringStaffs iSpringStaffs){
        this.iSpringStaffs=iSpringStaffs;
    }

    @Override
    @Transactional
    public List<Staffs> getAll() {
        return this.iSpringStaffs.findAll();
    }

    @Override
    public void add(Staffs staff) {
        this.iSpringStaffs.save(staff);
    }

    @Override
    public void update(Staffs staff) {
        this.iSpringStaffs.save(staff);
    }


    @Override
    public void delete(Staffs staff) {
        this.iSpringStaffs.delete(staff);
    }

    @Override
    public Staffs getById(int staffId) {
        //return this.iStaffsDal.getById(staffId);
        return this.iSpringStaffs.findStaffsByStaffId(staffId);
    }

    @Override
    public Staffs getByUserName(String userName) {
        return this.iSpringStaffs.findStaffsByUserName(userName);
    }
}
