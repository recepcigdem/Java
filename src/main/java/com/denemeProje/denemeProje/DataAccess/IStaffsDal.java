package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.*;

import java.util.List;

public interface IStaffsDal {
    List<Staffs> getAll();
    void add(Staffs staff);
    void update(Staffs staff);
    void delete(Staffs staff);
    Staffs getById(int staffId);
    Staffs getByUserName(String userName);
}
