package com.liucan.spring;

import java.lang.annotation.*;

/**
 * 自动设置属性值
 *
 * @author liucan
 * @version 2020/8/30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HelloValue {
    String value() default "";
}
