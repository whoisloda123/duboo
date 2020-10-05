package com.liucan.spring.loda;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * The loda component likes {@link Component}
 *
 * @author liucan
 * @see Component
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Loda {
    /**
     * Loda component name ,use default name if empty
     */
    String value() default "";
}
