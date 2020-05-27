package com.denemeProje.denemeProje.Business;


import com.denemeProje.denemeProje.DataAccess.ISpringLabel;
import com.denemeProje.denemeProje.Entities.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LabelManager implements ILabelService{

    private ISpringLabel iSpringLabel;

    @Autowired
    public LabelManager(ISpringLabel iSpringLabel) {
        this.iSpringLabel = iSpringLabel;
    }

    @Override
    @Transactional
    public List<Label> getAll() {
        return this.iSpringLabel.findAll();
    }

    @Override
    public void add(Label label) {
        this.iSpringLabel.save(label);
    }

    @Override
    public void delete(Label label) {
        this.iSpringLabel.delete(label);
    }

    @Override
    public void update(Label label) {
        this.iSpringLabel.save(label);
    }

    @Override
    public Label getById(int labelId) {
        return this.iSpringLabel.findAllByLabelId(labelId);
    }
}
