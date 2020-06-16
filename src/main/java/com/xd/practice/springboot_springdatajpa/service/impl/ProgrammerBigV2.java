package com.xd.practice.springboot_springdatajpa.service.impl;

import com.xd.practice.springboot_springdatajpa.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName ProgrammerBigV2
 * @Description 透明代理（普通代理）
 * @Author xiaqi
 * @Date 11/06/2020 14:56
 * @Version 1.0
 **/
public class ProgrammerBigV2 implements ProgrammerService {
    // 指定程序员大V要给Java3y点赞
    @Autowired
    Java3y java3y ;

    // 只做Java3y的生意了
    public ProgrammerBigV2() {
        //初始化直接 new Java3y
        this.java3y = new Java3y();
    }

    // 加价啦 (代理类自定义方法)
    public void addMoney() {
        System.out.println("这次我要加100块");
    }

    // 程序员大V点赞评论收藏转发
    public void upvote() {
        System.out.println("程序员大V点赞评论收藏转发！");
    }

    @Override
    public void coding() {

        // 让Java3y发文章了
        java3y.coding();

        // 程序员大V点赞评论收藏转发！
        upvote();
        addMoney();
    }
}
