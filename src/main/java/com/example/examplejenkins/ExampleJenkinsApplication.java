package com.example.examplejenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleJenkinsApplication.class, args);
    }

    public int sum(int a, int b){
        return a*b;
    }

}
