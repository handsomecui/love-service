package com.hbc.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.hbc.impl")
public class LoveServiceImplApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoveServiceImplApplication.class, args);
  }

}
