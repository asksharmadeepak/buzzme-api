package com.example.buzzmeapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Buzz {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date event;
    private int frequency;
    private String modeOfNotification;
    private String email;

    public Buzz() {
    }

    public Buzz(long id, Date event, int frequency, String modeOfNotification, String email) {
        this.id = id;
        this.event = event;
        this.frequency = frequency;
        this.modeOfNotification = modeOfNotification;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getEvent() {
        return event;
    }

    public void setEvent(Date event) {
        this.event = event;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getModeOfNotification() {
        return modeOfNotification;
    }

    public void setModeOfNotification(String modeOfNotification) {
        this.modeOfNotification = modeOfNotification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
