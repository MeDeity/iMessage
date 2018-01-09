package com.deity.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * webservice日志记录
 * 其中@Component
 * Created by Deity on 2018/1/9.
 */
@Aspect
@Component
public class WebserviceLogAspect {
    private Logger logger = LoggerFactory.getLogger(WebserviceLogAspect.class);//Logger.getLogger(WebserviceLogAspect.class);

    @Pointcut("execution(public * com.deity.controller..*.*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        StringBuilder builder = new StringBuilder();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("request url:" + request.getRequestURL() + " request Method:" + request.getMethod() + " request Ip:" + request.getRemoteHost());
        Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String name = enumeration.nextElement();
            logger.info("name:{},value:{}", name, request.getParameter(name));
        }
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfter(Object object){
        logger.info("response:"+object);
    }
}
