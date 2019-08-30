package com.lzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }
    @Bean
    public RestTemplate getRestTemplate(){//Bean注解的方式去注入
        return new RestTemplate();
    }
}
