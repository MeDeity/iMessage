package com.deity.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用
 * 其中 @RestController = @Controller+@ResponseBody
 * Created by Deity on 2017/12/28.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String testIndex(){
        logger.info("invoke testIndex");
        return "this is index str";
    }
}
