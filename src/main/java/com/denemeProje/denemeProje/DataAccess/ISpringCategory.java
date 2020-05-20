package com.denemeProje.denemeProje.DataAccess;

import com.denemeProje.denemeProje.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringCategory extends JpaRepository<Category, Long> {

    public Category findCategoryByCategoryId(Integer id);

}
