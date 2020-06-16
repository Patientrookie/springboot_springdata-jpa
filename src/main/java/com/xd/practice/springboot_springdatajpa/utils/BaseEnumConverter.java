package com.xd.practice.springboot_springdatajpa.utils;

import javax.persistence.AttributeConverter;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * @ClassName BaseEnumConvert
 * @Description TODO
 * @Author xiaqi
 * @Date 16/06/2020 9:57
 * @Version 1.0
 **/
public abstract class BaseEnumConverter<X extends BaseEnum<Y>, Y> implements AttributeConverter<BaseEnum<Y>, Y> {
    private Class<X> xclazz;
    private Method valuesMethod;


    public BaseEnumConverter() {
        this.xclazz = (Class<X>) (((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments())[0];
        try {
            valuesMethod = xclazz.getMethod("values");
        } catch (Exception e) {
            throw new RuntimeException("can't get values method from " + xclazz);
        }
    }

    @Override
    public Y convertToDatabaseColumn(BaseEnum<Y> attribute) {
        return attribute == null ? null : attribute.getValue();
    }

    @SuppressWarnings("unchecked")
    @Override
    public X convertToEntityAttribute(Y dbData) {
        try {
            X[] values = (X[]) valuesMethod.invoke(null);
            for (X x : values) {
                if (x.getValue().equals(dbData)) {
                    return x;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("can't convertToEntityAttribute" + e.getMessage());
        }
        throw new RuntimeException("unknown dbData " + dbData);
    }
}
