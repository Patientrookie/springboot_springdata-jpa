package com.xd.practice.springboot_springdatajpa;

import com.xd.practice.springboot_springdatajpa.service.ProgrammerService;
import com.xd.practice.springboot_springdatajpa.service.impl.Java3y;
import com.xd.practice.springboot_springdatajpa.service.impl.ProgrammerBigV1;
import com.xd.practice.springboot_springdatajpa.service.impl.ProgrammerBigV2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Proxy;

/**
 * @ClassName ProgrammerServiceTest
 * @Description TODO
 * @Author xiaqi
 * @Date 11/06/2020 14:46
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgrammerServiceTest {

    @Autowired
    Java3y java3y;

    @Test
    /**
     * @Description: 静态代理
     * @Author: xiaqi
     * @Date: 11/06/2020 14:59
     * @Param: []
     * @Return void
     **/
    public void staticProxyTest(){
        // 想要发达的Java3y
        Java3y java3y = new Java3y();

        // 受委托程序员大V
        ProgrammerService programmerService = new ProgrammerBigV1(java3y);

        // 受委托程序员大V让Java3y发文章，大V(自己)来点赞
        programmerService.coding();
    }

    @Test
    /**
     * @Description: 透明代理  又称 普通代理
     * @Author: xiaqi
     * @Date: 11/06/2020 15:00
     * @Param: []
     * @Return void
     **/
    public void transparentProxyTest(){
        ProgrammerService programmerService = new ProgrammerBigV2();
        programmerService.coding();
    }

    @Test
    /**
     * @Description: 动态代理  根据java提供的Proxy代理类
     * @Author: xiaqi
     * @Date: 11/06/2020 15:08
     * @Param: []
     * @Return void
     **/
    public void dynamicProxyTest(){
        ProgrammerService programmerService = (ProgrammerService) Proxy.newProxyInstance(java3y.getClass().getClassLoader(),java3y.getClass().getInterfaces(),(proxy, method, args) -> {
            // 如果是调用coding方法，那么水军就要点赞了
            if (method.getName().equals("coding")) {
                method.invoke(java3y, args);
                System.out.println("我是水军，我来点赞了！");
            } else {
                // 如果不是调用coding方法，那么调用原对象的方法
                return method.invoke(java3y, args);
            }
            return null;
        });

        // 每当Java3y写完文章，水军都会点赞
        programmerService.coding();
    }
}
