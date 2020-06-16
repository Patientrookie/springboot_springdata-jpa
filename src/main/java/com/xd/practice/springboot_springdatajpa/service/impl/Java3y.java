package com.xd.practice.springboot_springdatajpa.service.impl;

import com.xd.practice.springboot_springdatajpa.service.ProgrammerService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProgrammerServiceImpl
 * @Description 静态代理模式实现
 * @Author xiaqi
 * @Date 11/06/2020 14:33
 * @Version 1.0
 **/
@Service
public class Java3y implements ProgrammerService {
    @Override
    public void coding() {
        System.out.println("Java3y最新文章：......给女朋友讲解什么是代理模式.......");
    }
}
