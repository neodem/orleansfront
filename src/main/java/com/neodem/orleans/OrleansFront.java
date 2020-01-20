package com.neodem.orleans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Vincent Fumo (neodem@gmail.com)
 * Created on 1/20/20
 */
@SpringBootApplication
public class OrleansFront {
    public static void main(String[] args) {
        SpringApplication.run(OrleansFront.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
