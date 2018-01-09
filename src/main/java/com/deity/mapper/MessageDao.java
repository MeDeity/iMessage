package com.deity.mapper;

import com.deity.entity.MessageJPA;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA测试
 * Created by Deity on 2018/1/9.
 */
public interface MessageDao extends JpaRepository<MessageJPA,Integer>{
}
