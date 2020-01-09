package com.study.format;

import com.study.format.FormatService;

import java.util.Objects;

/**
 * created by zlz on 2020/1/8
 */
public class StringFormatServiceImpl implements FormatService {

    public <T> String format(T o) {
        return "String form"+Objects.toString(o);
    }
}
