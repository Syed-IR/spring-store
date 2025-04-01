package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// or @Component. @Service is just an alias for @component
//@Service
public class OrderService {
    private final PaymentService paymentService;

    // @Autowired
    // public OrderService(PaymentService paymentService)
//    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
    // Custom Bean configuration
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        paymentService.processPayment(10.00);
    }
}
