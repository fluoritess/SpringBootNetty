package com.example.springbootnetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.springbootnetty.mapper")
@ComponentScan(basePackages = {"com.example.springbootnetty.*","org.n3r.idworker"})
public class SpringbootnettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootnettyApplication.class, args);
    }

}

