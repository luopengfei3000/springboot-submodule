package com.luopf.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(value="com.luopf.example")
@SpringBootApplication
public class MmsMdsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmsMdsWebApplication.class, args);
    }

}
