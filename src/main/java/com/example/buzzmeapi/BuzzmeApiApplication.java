package com.example.buzzmeapi;

import com.example.buzzmeapi.services.NotificationScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class BuzzmeApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuzzmeApiApplication.class, args);
	}

}
