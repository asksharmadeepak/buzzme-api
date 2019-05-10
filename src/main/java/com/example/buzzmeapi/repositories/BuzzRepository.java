package com.example.buzzmeapi.repositories;

import com.example.buzzmeapi.models.Buzz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BuzzRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int buzz(Buzz buzz) {
        return jdbcTemplate.update("insert into buzz(event, frequency, modeOfNotification, email)" + " values(?, ?, ? ,?)",
                new Object[]{
                        buzz.getEvent(), buzz.getFrequency(), buzz.getModeOfNotification(), buzz.getEmail()
                });
    }
}
