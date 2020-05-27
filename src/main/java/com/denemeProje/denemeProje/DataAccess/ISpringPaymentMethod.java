package com.denemeProje.denemeProje.DataAccess;


import com.denemeProje.denemeProje.Entities.Paymentmethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpringPaymentMethod extends JpaRepository<Paymentmethod,Long> {

    public Paymentmethod findAllByPaymentmethodId(Integer id);
}
