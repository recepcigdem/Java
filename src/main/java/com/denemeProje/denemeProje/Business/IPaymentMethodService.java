package com.denemeProje.denemeProje.Business;

import com.denemeProje.denemeProje.Entities.Paymentmethod;

import java.util.List;


public interface IPaymentMethodService {

    List<Paymentmethod> getAll();
    void add(Paymentmethod paymentmethod);
    void delete(Paymentmethod paymentmethod);
    void update(Paymentmethod paymentmethod);
    Paymentmethod getById(int paymentmethodId);
}
