package com.study.starterdemo;

import com.study.FormatTemplate;
import com.study.format.JsonFormatServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterDemoApplication.class, args);
    }

//    @Bean
//    public FormatTemplate getFormatService(){
//        return new FormatTemplate(new JsonFormatServiceImpl());
//    }


}
