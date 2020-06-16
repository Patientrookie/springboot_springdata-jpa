package com.xd.practice.springboot_springdatajpa.enums;

import com.xd.practice.springboot_springdatajpa.utils.BaseEnum;
import com.xd.practice.springboot_springdatajpa.utils.BaseEnumConverter;
import lombok.Data;
import lombok.Getter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @ClassName Gender
 * @Description TODO
 * @Author xiaqi
 * @Date 15/06/2020 17:08
 * @Version 1.0
 **/
public enum Gender implements BaseEnum<Integer> {

    /**
     * 男
     */
    MALE("MALE",0),
    /**
     * 女
     */
    FEMALE("FEMALE",1);
    /**
     * 性别编码
     */
    private String code;
    /**
     * 存入数据库中的值
     */
    private Integer value;

    /**
     *
     * @param code
     * @param value
     */
    Gender(String code, Integer value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    /**
     * @Description: 实体属性类型转换器
     * @Author: xiaqi
     * @Date: 15/06/2020 17:24
     * @Param:
     * @Return
     **/
    @Converter
    public static class Convert extends BaseEnumConverter<Gender, Integer> {
    }
}
