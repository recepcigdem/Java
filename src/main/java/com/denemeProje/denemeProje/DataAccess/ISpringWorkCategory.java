package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Workcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringWorkCategory extends JpaRepository<Workcategory,Long> {

    public Workcategory findAllByWorkcategoryId(Integer id);
}
