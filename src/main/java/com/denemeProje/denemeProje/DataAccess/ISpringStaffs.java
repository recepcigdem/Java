package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringStaffs extends JpaRepository<Staffs,Long> {

    public Staffs findStaffsByStaffId(Integer id);

    public Staffs findStaffsByUserName(String userName);


}
