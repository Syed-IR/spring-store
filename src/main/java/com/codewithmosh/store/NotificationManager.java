package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(@Qualifier("sms") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.send(message);
    }
}
