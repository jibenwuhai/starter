package com.study.starterdemo.web;

import com.study.FormatTemplate;
import com.study.starterdemo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by zlz on 2020/1/8
 */
@RestController
@RequestMapping("format")
public class UserController {

    @Autowired
    private FormatTemplate formatTemplate;

    @GetMapping("getUser")
    public String getUserFormat(){
        UserDto userDto = new UserDto();
        userDto.setName("小明");
        userDto.setAge(18);
        //FormatTemplate formatTemplate = new FormatTemplate(new ObjectFormatServiceImpl());
        String formatString =  formatTemplate.doFormat(userDto);
        return formatString;
    }
}
