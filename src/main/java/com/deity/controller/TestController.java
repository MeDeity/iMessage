package com.deity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用
 * Created by Deity on 2017/12/28.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String testIndex(){
        return "this is index str";
    }
}
