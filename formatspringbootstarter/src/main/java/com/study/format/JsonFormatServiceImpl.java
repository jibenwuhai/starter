package com.study.format;

import com.alibaba.fastjson.JSONObject;
import com.study.format.FormatService;

/**
 * created by zlz on 2020/1/8
 */
public class JsonFormatServiceImpl implements FormatService {

    public <T> String format(T o) {
        return "json format:"+JSONObject.toJSONString(o);
    }
}
