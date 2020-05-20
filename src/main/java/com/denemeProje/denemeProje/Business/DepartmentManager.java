package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringDepartment;
import com.denemeProje.denemeProje.Entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DepartmentManager implements IDepartmentService{

    private ISpringDepartment iSpringDepartment;

    @Autowired
    public DepartmentManager(ISpringDepartment iSpringDepartment){
        this.iSpringDepartment=iSpringDepartment;
    }

    @Override
    @Transactional
    public List<Department> getAll() {
        return this.iSpringDepartment.findAll();
    }

    @Override
    public void add(Department department) {
        this.iSpringDepartment.save(department);
    }

    @Override
    public void delete(Department department) {
        this.iSpringDepartment.delete(department);
    }

    @Override
    public void update(Department department) {
        this.iSpringDepartment.save(department);
    }

    @Override
    public Department getById(int departmentId) {
        return this.iSpringDepartment.findDepartmentByDepartmentId(departmentId);
    }
}
