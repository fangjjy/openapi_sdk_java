package com.fang.openapi.util;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: openapi-java-sdk
 * @description: 反射帮助类
 * @author: Songle
 * @create: 2018-07-18 15:22
 **/
public class ReflectHelper {

    final static Logger logger = LoggerFactory.getLogger(ReflectHelper.class);

    public static Map <String, String> transferBeanToForm(Object obj) {
        if (obj == null) return null;
        StringBuilder sb = new StringBuilder();
        Map <String, Object> describe = new HashMap <String, Object>();
        Map <String, String> result = new HashMap <>();
        try {
            describe = PropertyUtils.describe(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            logger.error("反射异常", e);
            return null;
        } catch (NoSuchMethodException e) {
            logger.error("反射异常", e);
            return null;
        }
        for (Map.Entry <String, Object> entry : describe.entrySet()) {

            if (entry.getValue() != null && (isBaseType(entry.getValue()) || isString(entry.getValue()))) {
                result.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return result;
    }

    private static boolean isBaseType(Object v) {
        String clazzName = v.getClass().getName();
        if (clazzName.equals(Double.class.getName())
                || clazzName.equals(Integer.class.getName())
                || clazzName.equals(Short.class.getName())
                || clazzName.equals(BigInteger.class.getName())
                || clazzName.equals(Double.class.getName())
                || clazzName.equals(Float.class.getName()
        )

                ) {
            return true;
        } else return false;
    }

    /**
     * 查看obj中fieldname的值，如果不存在改字段，将返回null
     *
     * @param obj
     * @param fieldname
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static Object getBeanFieldValue(Object obj, String fieldname) {

        try {
            return PropertyUtils.getProperty(obj, fieldname);
        } catch (IllegalAccessException e) {
            logger.error("获取属性异常", e);
        } catch (InvocationTargetException e) {
            logger.error("获取属性异常", e);
        } catch (NoSuchMethodException e) {
            return null;
        }
        return null;
    }

    public static boolean isString(Object v) {
        String clazzName = v.getClass().getName();
        return clazzName.equals(String.class.getName());
    }
}
