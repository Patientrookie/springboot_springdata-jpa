package com.xd.practice.springboot_springdatajpa.utils;

/**
 * @ClassName BaseEnum
 * @Description 枚举基类
 * @Author xiaqi
 * @Date 16/06/2020 10:09
 * @Version 1.0
 **/
public interface BaseEnum<Y> {

    /**
     * 存取到数据库中的值.
     * @return
     */
    public Y getValue();

}
