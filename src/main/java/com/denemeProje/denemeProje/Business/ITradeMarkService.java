package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Trademark;

import java.util.List;

public interface ITradeMarkService {
    List<Trademark> getAll();
    void add(Trademark trademark);
    void update(Trademark trademark);
    void delete(Trademark trademark);
    Trademark getById(int trademarkId);
}
