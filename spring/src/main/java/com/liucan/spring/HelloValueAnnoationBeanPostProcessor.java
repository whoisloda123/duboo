package com.liucan.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;

/**
 * 处理 {@link HelloValue}
 *
 * @author liucan
 * @version 2020/8/30
 */
public class HelloValueAnnoationBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(HelloValue.class)) {
                System.out.println(String.format("postProcessBeforeInitialization:%s", beanName));
                if (field.getType() == String.class) {
                    String value = field.getAnnotation(HelloValue.class).value();
                    if (!StringUtils.isEmpty(value)) {
                        try {
                            field.setAccessible(true);
                            field.set(bean, value);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(HelloValue.class)) {
                System.out.println(String.format("postProcessAfterInitialization:%s", beanName));
            }
        }
        return bean;
    }
}
