package com.denemeProje.denemeProje.Business;


import com.denemeProje.denemeProje.DataAccess.ISpringPaymentMethod;
import com.denemeProje.denemeProje.Entities.Paymentmethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PaymentMethodManager implements IPaymentMethodService{

    private ISpringPaymentMethod iSpringPaymentMethod;

    @Autowired
    public PaymentMethodManager(ISpringPaymentMethod iSpringPaymentMethod) {
        this.iSpringPaymentMethod = iSpringPaymentMethod;
    }

    @Override
    @Transactional
    public List<Paymentmethod> getAll() {
        return this.iSpringPaymentMethod.findAll();
    }

    @Override
    public void add(Paymentmethod paymentmethod) {
        this.iSpringPaymentMethod.save(paymentmethod);
    }

    @Override
    public void delete(Paymentmethod paymentmethod) {
        this.iSpringPaymentMethod.delete(paymentmethod);
    }

    @Override
    public void update(Paymentmethod paymentmethod) {
        this.iSpringPaymentMethod.save(paymentmethod);
    }

    @Override
    public Paymentmethod getById(int paymentmethodId) {
        return this.iSpringPaymentMethod.findAllByPaymentmethodId(paymentmethodId);
    }
}
