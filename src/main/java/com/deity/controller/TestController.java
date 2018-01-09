package com.deity.controller;

import com.deity.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    @Autowired
    private MessageService messageService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String testIndex(){
        logger.info("invoke testIndex");
        return "this is index str";
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String addMessage(){
        messageService.createJdbcMessage();
        return "add Message success";
    }
}
