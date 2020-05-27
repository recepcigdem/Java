package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Label;

import java.util.List;

public interface ILabelService {

    List<Label> getAll();
    void add(Label label);
    void delete(Label label);
    void update(Label label);
    Label getById(int labelId);
}
