package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Agegroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringAgegroup extends JpaRepository<Agegroup,Long> {

    public Agegroup findAgegroupByAgegroupId(int id);
}
