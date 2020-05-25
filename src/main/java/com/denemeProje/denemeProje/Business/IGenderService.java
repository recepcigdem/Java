package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Gender;

import java.util.List;

public interface IGenderService {
    List<Gender> getAll();
    void add(Gender gender);
    void delete(Gender gender);
    void update(Gender gender);
    Gender getById(int genderId);
}
