package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Definition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringDefinition extends JpaRepository<Definition,Long> {

    public Definition findDefinitionByDefinitionId(Integer id);

    public Definition findDefinitionByCategoryId(Integer categoryid);
}
