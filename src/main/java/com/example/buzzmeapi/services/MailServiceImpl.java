package com.example.buzzmeapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.Properties;

@Component
public class MailServiceImpl {


    @Autowired
    private MailSender mailSender;

    public void sendNotificationOnMail(String mailId, String payload) throws MessagingException {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("deepsharma989@gmail.com", "deepak2015");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("deepsharma989@gmail.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("deepsharma989@gmail.com"));
        msg.setSubject("Hi Buzz Me notification arrived !!!");
        msg.setContent("Please book you ticket on this date", "text/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent("Please book you ticket on this date", "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        msg.setContent(multipart);
        Transport.send(msg);


    }
}
