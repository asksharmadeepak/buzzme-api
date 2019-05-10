package com.example.buzzmeapi.controllers;

import com.example.buzzmeapi.services.MailServiceImpl;
import com.example.buzzmeapi.utils.EndPoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;

@Controller
public class SendMailController {

    @Autowired
    MailServiceImpl mailServiceImpl;

    @RequestMapping(EndPoints.SEND_MAIL)
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public String sendMailTo(@RequestParam(required = false) String mailId,
                                  @RequestParam(required = false) String payload) throws MessagingException {
        mailServiceImpl.sendNotificationOnMail(mailId, payload);
        return "Email sent successfully";
    }
}
