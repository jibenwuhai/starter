package com.study.starterdemo.dto;

import javax.annotation.sql.DataSourceDefinition;

/**
 * created by zlz on 2020/1/8
 */
public class UserDto {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
