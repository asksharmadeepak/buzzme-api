package com.example.buzzmeapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl {


    @Autowired
    private MailSender mailSender;

    public void sendNotificationOnMail(String mailId, String payload) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("deepsharma989@gmail.com");
        message.setTo("milandalsaniya@yahoo.com"); //mailId
        message.setSubject("Hi Buzz Me notification arrived !!!");
        message.setText("Please book you ticket on this date"); // Payload
        mailSender.send(message);

    }
}
