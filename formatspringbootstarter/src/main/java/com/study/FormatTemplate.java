package com.study;

import com.study.format.FormatService;

/**
 * created by zlz on 2020/1/8
 */
public class FormatTemplate {

    private FormatService formatService;

    public FormatTemplate(FormatService formatService) {
        this.formatService = formatService;
    }

    public <T> String doFormat(T o){
        return formatService.format(o);
    }
}
