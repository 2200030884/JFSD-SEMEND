package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)  
public class ExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();  
    }
}
