package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringLabel extends JpaRepository<Label,Long> {

    public Label findAllByLabelId(Integer id);

}
