package com.flea;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserAplication {
    public static void main(String[] args) {
        SpringApplication.run(UserAplication.class, args);
    }
}