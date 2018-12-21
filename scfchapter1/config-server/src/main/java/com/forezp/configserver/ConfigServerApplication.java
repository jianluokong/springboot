package com.forezp.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    //http://localhost:8888/foo/dev
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}

