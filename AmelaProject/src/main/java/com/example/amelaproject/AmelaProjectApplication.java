package com.example.amelaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AmelaProjectApplication //implements CommandLineRunner
 {

    public static void main(String[] args) {
        SpringApplication.run(AmelaProjectApplication.class, args);
    }

}
