package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface ISpringGender extends JpaRepository<Gender,Long> {

    public Gender findGenderByGenderId(Integer id);
}
