package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Definition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISpringDefinition extends JpaRepository<Definition,Long> {

    public Definition findDefinitionByDefinitionId(Integer id);

    public List<Definition> findDefinitionByCategoryId(Integer categoryid);
}
