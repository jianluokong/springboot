package com.forezp.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        System.out.println(name);
        return "hi,"+name+",sorry,error!";
    }

    @HystrixCommand(fallbackMethod = "hiHomeError")
    public String hiHome() {
        return restTemplate.getForObject("http://SERVICE-HI/hiHome", String.class);
    }

    public String hiHomeError() {
        return "hiHomeError,sorry,error!";
    }
}
