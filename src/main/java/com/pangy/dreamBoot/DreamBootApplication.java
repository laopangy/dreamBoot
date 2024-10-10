package com.pangy.dreamBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.pangy.dreamBoot.mapper")
public class DreamBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamBootApplication.class, args);
    }

}
