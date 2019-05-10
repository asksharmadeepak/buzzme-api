package com.example.buzzmeapi.services;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {

    @Scheduled(cron = "* * 14 * * *")
    public void userToNotify() {
        System.out.println("scheduler called...");
    }
}
