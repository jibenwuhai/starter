package com.study.autoConfiguration;

import com.study.format.FormatService;
import com.study.format.JsonFormatServiceImpl;
import com.study.format.StringFormatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * created by zlz on 2020/1/8
 */
@Configuration
@EnableConfigurationProperties(FormatProperties.class)
public class FormatAutoConfiguration {

    @Autowired
    private FormatProperties formatProperties;

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatService getStringFormat(){
        String user = formatProperties.getUser();
        String password = formatProperties.getPassword();
        System.out.println("初始化：StringFormat");
        System.out.println("user:"+user);
        System.out.println("password:"+password);
        return new StringFormatServiceImpl();
    }

    @ConditionalOnClass(name="com.alibaba.fastjson.JSON")
    @Bean
    public FormatService getJsonFormat(){
        String user = formatProperties.getUser();
        String password = formatProperties.getPassword();
        System.out.println("初始化：StringFormat");
        System.out.println("user:"+user);
        System.out.println("password:"+password);
        return new JsonFormatServiceImpl();
    }
}
