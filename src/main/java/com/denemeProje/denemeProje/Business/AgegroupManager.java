package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringAgegroup;
import com.denemeProje.denemeProje.Entities.Agegroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AgegroupManager implements  IAgegroupService{

    private ISpringAgegroup iSpringAgegroup;

    @Autowired
    public AgegroupManager(ISpringAgegroup iSpringAgegroup) {
        this.iSpringAgegroup = iSpringAgegroup;
    }


    @Override
    @Transactional
    public List<Agegroup> getAll() {
        return this.iSpringAgegroup.findAll();
    }

    @Override
    public void add(Agegroup ageGroup) {
        this.iSpringAgegroup.save(ageGroup);
    }

    @Override
    public void delete(Agegroup ageGroup) {
        this.iSpringAgegroup.delete(ageGroup);
    }

    @Override
    public void update(Agegroup ageGroup) {
        this.iSpringAgegroup.save(ageGroup);
    }

    @Override
    public Agegroup getById(int ageGroupId) {
        return this.iSpringAgegroup.findAgegroupByAgegroupId(ageGroupId);
    }
}
