package com.liucan.spring.loda;

import java.lang.annotation.*;

/**
 * loda annotation
 *
 * @author liucan
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface LodaType {
    /**
     * loda type
     *
     * @return
     */
    int type() default 0;
}
