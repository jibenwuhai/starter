package com.study.autoConfiguration;

import com.study.format.FormatService;
import com.study.format.JsonFormatServiceImpl;
import com.study.format.ObjectFormatServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * created by zlz on 2020/1/8
 */
@Configuration
public class FormatAutoConfiguration {

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatService getStringFormat(){
        return new ObjectFormatServiceImpl();
    }

    @ConditionalOnClass(name="com.alibaba.fastjson.JSON")
    @Bean
    public FormatService getJsonFormat(){
        return new JsonFormatServiceImpl();
    }
}
