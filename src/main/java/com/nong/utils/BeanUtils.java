package com.nong.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public class BeanUtils {

    public static Class<?> getSuperClassGenricType(Class<?> clazz) {
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            return ((Class<?>) p[0]);
        }
        return null;
    }

    public static String getNameSpace(Class clazz){
        Class<?> genericClass = getSuperClassGenricType(clazz);
        return genericClass == null ? null : genericClass.getName();
    }
}
