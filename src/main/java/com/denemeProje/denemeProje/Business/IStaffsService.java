package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Staffs;

import java.util.List;

public interface IStaffsService {
    List<Staffs> getAll();
    void add(Staffs staffs);
    void update(Staffs staff);
    void delete(Staffs staff);
    Staffs getById(int staffId);
   // Staffs getByUserName(String userName);
}
