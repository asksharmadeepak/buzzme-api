package com.example.buzzmeapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class MailServiceImpl {

    @Autowired
    private JavaMailSender sender;

    public void sendNotificationOnMail(String mailId, String payload) throws MessagingException {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo(mailId);
        helper.setText(payload);
        helper.setSubject("Hi");

        sender.send(message);

    }
}
