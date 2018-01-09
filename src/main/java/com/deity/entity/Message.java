package com.deity.entity;

/**
 * 用户实体类(MyBatis)
 * Created by Deity on 2018/1/9.
 */

public class Message {
    /**编号*/
    private int id;
    /**消息内容*/
    private String message;
    /**接收人Id*/
    private int receiverId;
    /**发送人Id*/
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
