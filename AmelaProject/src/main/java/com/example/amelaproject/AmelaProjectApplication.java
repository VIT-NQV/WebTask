package com.example.amelaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AmelaProjectApplication //implements CommandLineRunner
 {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(AmelaProjectApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//        String sql = "INSERT INTO `amelaproject`.`listtask` (`title`, `status`, `describe`) VALUES (?, ?, ?)";
//
//        int result = jdbcTemplate.update(sql, "task26", "OPEN", "do something 26");
//
//        if (result > 0){
//            System.out.println("A new row");
//        }
//    }
}
