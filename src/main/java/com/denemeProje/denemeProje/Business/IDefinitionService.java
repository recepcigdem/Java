package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Definition;

import java.util.List;

public interface IDefinitionService {

    List<Definition> getAll();
    void add(Definition definition);
    void delete(Definition definition);
    void update(Definition definition);
    Definition getById(int definitionId);
}
