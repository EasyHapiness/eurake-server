package com.springcloud.eurakeserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurakeServer1Application.class, args);
    }
}
