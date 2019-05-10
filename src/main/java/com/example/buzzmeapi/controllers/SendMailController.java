package com.example.buzzmeapi.controllers;

import com.example.buzzmeapi.services.MailServiceImpl;
import com.example.buzzmeapi.utils.EndPoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SendMailController {

    @Autowired
    MailServiceImpl mailServiceImpl;

    @RequestMapping(EndPoints.SEND_MAIL)
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public void getAirportDetails(@RequestParam(required = false) String mailId,
                                  @RequestParam(required = false) String payload) {
        mailServiceImpl.sendNotificationOnMail(mailId, payload);
    }
}
