package com.example.mycatdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.mycatdemo.mapper"})
public class MycatdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycatdemoApplication.class, args);
    }

}
