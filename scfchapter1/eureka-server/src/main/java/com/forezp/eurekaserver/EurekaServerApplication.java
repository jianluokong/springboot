package com.forezp.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    //http://localhost:8761/
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
