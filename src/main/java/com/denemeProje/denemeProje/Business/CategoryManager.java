package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringCategory;
import com.denemeProje.denemeProje.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class CategoryManager implements ICategoryService{

    private ISpringCategory iSpringCategory;

    @Autowired
    public CategoryManager(ISpringCategory iSpringCategory){
        this.iSpringCategory=iSpringCategory;
    };

    @Override
    @Transactional
    public List<Category> getAll() {
        return this.iSpringCategory.findAll();
    }

    @Override
    public void add(Category category) {
        this.iSpringCategory.save(category);
    }

    @Override
    public void delete(Category category) {
        this.iSpringCategory.delete(category);
    }

    @Override
    public void update(Category category) {
        this.iSpringCategory.save(category);
    }

    @Override
    public Category getById(int categoryId) {
        return this.iSpringCategory.findCategoryByCategoryId(categoryId);
    }
}
