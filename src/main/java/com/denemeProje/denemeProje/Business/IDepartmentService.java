package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Department;

import java.util.List;

public interface IDepartmentService {

    List<Department> getAll();
    void add(Department department);
    void delete(Department department);
    void update(Department department);
    Department getById(int departmentId);
}
