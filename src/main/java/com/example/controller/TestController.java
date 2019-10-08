package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hsn
 * @description:
 * @date: 2019/9/12 10:04
 **/
@RestController
public class TestController {


    @RequestMapping(value = "/test")
    public String test(){
        return "你和";
    }
}
