package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Trademark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringTradeMark extends JpaRepository<Trademark,Long> {

    public Trademark findByTrademarkId(Integer id);
}
