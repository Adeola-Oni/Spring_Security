package com.adeola.security.springsecuritysample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.adeola.security.controller"), @ComponentScan("com.adeola.security.config")})
@EnableJpaRepositories("com.adeola.security.repository")
@EntityScan("com.adeola.security.model")
public class HotelGuestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelGuestSampleApplication.class, args);
	}
}

//use bookingDB; 
//
//CREATE TABLE `hotelguest`( 
//    `id` int NOT NULL AUTO_INCREMENT, 
//    `email` varchar(45) NOT NULL, 
//    `password` varchar(200) NOT NULL, 
//    `role` varchar(45) NOT NULL, 
//    PRIMARY KEY(`id`) 
//); 
//
//INSERT IGNORE INTO `hotelguest` VALUES (NULL, 'raymondreddington@example.com', '56789', 'admin');


























