package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.DataAccess.ISpringTradeMark;
import com.denemeProje.denemeProje.Entities.Trademark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TradeMarkManager implements ITradeMarkService{

    private ISpringTradeMark iSpringTradeMark;

    @Autowired
    public TradeMarkManager(ISpringTradeMark iSpringTradeMark) {
        this.iSpringTradeMark = iSpringTradeMark;
    }

    @Override
    @Transactional
    public List<Trademark> getAll() {
        return this.iSpringTradeMark.findAll();
    }

    @Override
    public void add(Trademark trademark) {
        this.iSpringTradeMark.save(trademark);
    }

    @Override
    public void update(Trademark trademark) {
        this.iSpringTradeMark.save(trademark);
    }

    @Override
    public void delete(Trademark trademark) {
        this.iSpringTradeMark.delete(trademark);
    }

    @Override
    public Trademark getById(int trademarkId) {
        return this.iSpringTradeMark.findByTrademarkId(trademarkId);
    }
}
