package com.study.starterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterDemoApplication.class, args);
    }

  //  @Bean
  //  public FormatTemplate getFormatService(){
  //      return new FormatTemplate(new JsonFormatServiceImpl());
  //  }


}
