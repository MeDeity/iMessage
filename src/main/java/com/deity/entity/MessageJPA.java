package com.deity.entity;


import javax.persistence.*;

/**
 * 集成JPA测试
 * Created by Deity on 2018/1/9.
 */
@Entity
@Table(name = "t_message")
public class MessageJPA {
    /**编号*/
    @Id
    @GeneratedValue
    private int id;
    /**消息内容*/
    @Column(name = "message")
    private String message;
    /**接收人Id*/
    @Column(name = "receiverId")
    private int receiverId;
    /**发送人Id*/
    @Column(name = "senderId")
    private int senderId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }
}
