package com.example.buzzmeapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Buzz {
    @Id
    private long id;
    private Date event;
    private int frequency;
    private String modeOfNotification;
    private String email;
}
