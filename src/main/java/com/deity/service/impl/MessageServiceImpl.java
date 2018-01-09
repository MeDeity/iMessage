package com.deity.service.impl;

import com.deity.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 消息操作
 * Intellij IDEA: No beans of 'JdbcTemplate' type found
 * After Intellij IDEA 2016.1.2, click Help->Edit Custom Properties, add new line with idea.spring.boot.filter.autoconfig=false and restart IDE, then the problem can be fixed.
 * You can check details in https://youtrack.jetbrains.com/issue/IDEA-139669
 * Created by Deity on 2018/1/9.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    @Override
    public void createJdbcMessage() {
        jdbcTemplate.update("INSERT INTO t_message VALUES (null,?,?,?);","你好,我们来聊天吧!!",12,13);
    }
}
