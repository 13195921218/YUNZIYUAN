package com.example.yunziyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.yunziyuan.*"})
@SpringBootApplication
public class YunziyuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunziyuanApplication.class, args);
    }

}
