package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ISpringDepartment extends JpaRepository<Department, Long>{

     public Department findDepartmentByDepartmentId(Integer id);
}
