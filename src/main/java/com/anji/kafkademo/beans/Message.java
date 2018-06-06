package com.anji.kafkademo.beans;

import lombok.Data;

import java.util.Date;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/6 15:50
 */
@Data
public class Message {
    private Long id;

    private String msg;

    private Date sendTime;
}
