package com.study.autoConfiguration;

import com.study.FormatTemplate;
import com.study.format.FormatService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * created by zlz on 2020/1/8
 */
@Import(FormatAutoConfiguration.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FormatService formatService){
        return new FormatTemplate(formatService);
    }
}
