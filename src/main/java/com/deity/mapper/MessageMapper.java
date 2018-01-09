package com.deity.mapper;

import com.deity.entity.Message;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * MyBatis
 * Created by Deity on 2018/1/9.
 */
public interface MessageMapper {
    @Select("select * from t_message where id = #{id}")
    Message obtainMessage(@Param("id") int id);
}
