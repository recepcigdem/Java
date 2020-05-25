package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringGender;
import com.denemeProje.denemeProje.Entities.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GenderManager  implements IGenderService{

    private ISpringGender iSpringGender;

    @Autowired
    public GenderManager(ISpringGender iSpringGender) {
        this.iSpringGender = iSpringGender;
    }

    @Override
    @Transactional
    public List<Gender> getAll() {
        return this.iSpringGender.findAll();
    }

    @Override
    public void add(Gender gender) {
        this.iSpringGender.save(gender);
    }

    @Override
    public void delete(Gender gender) {
        this.iSpringGender.delete(gender);
    }

    @Override
    public void update(Gender gender) {
        this.iSpringGender.save(gender);
    }

    @Override
    public Gender getById(int genderId) {
        return this.iSpringGender.findGenderByGenderId(genderId);
    }
}
