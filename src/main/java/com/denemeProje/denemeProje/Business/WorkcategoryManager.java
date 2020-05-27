package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringWorkCategory;
import com.denemeProje.denemeProje.Entities.Workcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WorkcategoryManager implements IWorkCategoryService{

    private ISpringWorkCategory iSpringWorkCategory;

    @Autowired
    public WorkcategoryManager(ISpringWorkCategory iSpringWorkCategory) {
        this.iSpringWorkCategory = iSpringWorkCategory;
    }

    @Override
    @Transactional
    public List<Workcategory> getAll() {
        return this.iSpringWorkCategory.findAll();
    }

    @Override
    public void add(Workcategory workcategory) {
        this.iSpringWorkCategory.save(workcategory);
    }

    @Override
    public void update(Workcategory workcategory) {
        this.iSpringWorkCategory.save(workcategory);
    }

    @Override
    public void delete(Workcategory workcategory) {
        this.iSpringWorkCategory.delete(workcategory);
    }

    @Override
    public Workcategory getById(int workCategoryId) {
        return this.iSpringWorkCategory.findAllByWorkcategoryId(workCategoryId);
    }
}
