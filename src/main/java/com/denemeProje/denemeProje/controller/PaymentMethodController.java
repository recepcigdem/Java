package com.denemeProje.denemeProje.controller;


import com.denemeProje.denemeProje.Business.IPaymentMethodService;
import com.denemeProje.denemeProje.Entities.Paymentmethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PaymentMethodController {

    private IPaymentMethodService iPaymentMethodService;

    @Autowired
    public PaymentMethodController(IPaymentMethodService iPaymentMethodService) {
        this.iPaymentMethodService = iPaymentMethodService;
    }
    @GetMapping("/paymentmethod")
    public List<Paymentmethod> getAll(){
        return iPaymentMethodService.getAll();
    }

    @PostMapping("/paymentmethod/add")
    public void add(Paymentmethod paymentmethod){
        iPaymentMethodService.add(paymentmethod);
    }
    @PutMapping("/paymentmethod/update")
    public void update(Paymentmethod paymentmethod){
        iPaymentMethodService.update(paymentmethod);
    }

    @PostMapping("/paymentmethod/delete")
    public void delete(Paymentmethod paymentmethod){
        iPaymentMethodService.update(paymentmethod);
    }
    @GetMapping("/paymentmethod/{id}")
    public void update(@PathVariable int paymentmethodid){
        iPaymentMethodService.getById(paymentmethodid);
    }
}
