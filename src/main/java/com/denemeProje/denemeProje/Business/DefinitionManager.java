package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringDefinition;
import com.denemeProje.denemeProje.Entities.Definition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DefinitionManager implements IDefinitionService{

    private ISpringDefinition iSpringDefinition;

    @Autowired
    public DefinitionManager(ISpringDefinition iSpringDefinition){
        this.iSpringDefinition = iSpringDefinition;
    }


    @Override
    @Transactional
    public List<Definition> getAll() {
        return this.iSpringDefinition.findAll();
    }

    @Override
    public void add(Definition definition) {
        this.iSpringDefinition.save(definition);
    }

    @Override
    public void delete(Definition definition) {
    this.iSpringDefinition.delete(definition);
    }

    @Override
    public void update(Definition definition) {
    this.iSpringDefinition.save(definition);
    }

    @Override
    public Definition getById(int definitionId) {
        return this.iSpringDefinition.findDefinitionByDefinitionId(definitionId);
    }
    @Override
    public Definition getByCategoryId(int categoryId) {
        return this.iSpringDefinition.findDefinitionByCategoryId(categoryId);
    }
}
