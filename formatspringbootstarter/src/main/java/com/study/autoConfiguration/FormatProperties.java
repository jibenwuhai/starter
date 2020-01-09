package com.study.autoConfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件
 *
 * @Author: zhenglongze
 * @Date 2020/1/9 13:49
 */
@ConfigurationProperties(prefix = "study.format")
public class FormatProperties {

    private String user;

    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
