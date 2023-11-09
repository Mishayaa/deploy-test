package com.example.deploytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DeployTestApplication {

    @GetMapping("/home")
    public String getEmployees() {
        return "HELLO EPTA";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeployTestApplication.class, args);
    }

}
