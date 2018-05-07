package com.crm.mydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.crm.mydemo.mapper")
public class MydemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MydemoApplication.class, args);
    }
}
