package com.liucan.spring.postprocessor;

import java.lang.annotation.*;

/**
 * 自动设置属性值
 *
 * @author liucan
 * @version 2020/8/30
 * @see HelloValueAnnotationBeanPostProcessor
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HelloValue {
    /**
     * set the hello value
     *
     * @return value
     */
    String value() default "";
}
