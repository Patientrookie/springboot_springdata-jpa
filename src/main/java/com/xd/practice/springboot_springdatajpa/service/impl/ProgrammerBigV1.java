package com.xd.practice.springboot_springdatajpa.service.impl;

import com.xd.practice.springboot_springdatajpa.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProgrammerBigV
 * @Description 静态代理模式实现
 * @Author xiaqi
 * @Date 11/06/2020 14:42
 * @Version 1.0
 **/
@Service
public class ProgrammerBigV1 implements ProgrammerService {

    //指定程序员大V要让谁发文章(先发文章、后点赞)
    @Autowired
    Java3y java3y ;

    public ProgrammerBigV1(Java3y java3y) {
        this.java3y = java3y;
    }

    // 加价啦 (代理类自定义方法)
    public void addMoney() {
        System.out.println("这次我要加100块");
    }

    //程序员大V点赞评论收藏转发
    public void upvote() {
        System.out.println("程序员大V点赞评论收藏转发！");
    }

    @Override
    public void coding() {

        // 让Java3y发文章
        java3y.coding();

        // 程序员大V点赞评论收藏转发！
        upvote();
        addMoney();
    }
}
