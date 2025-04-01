package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        var notificationService = context.getBean(NotificationManager.class);
        notificationService.sendNotification("Hi Sara!");
//        var orderService1 = new OrderService(new StripePaymentService());
//        var orderService2 = new OrderService(new PaypalPaymentService());
//        orderService1.placeOrder();
//        orderService2.placeOrder();
    }
}
