package com.liucan.spring.loda.event;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Determine whether support loda event
 *
 * @author liucan
 * @date 10/8/20 2:27 PM
 * @see LodaEventSelector
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LodaEventSelector.class)
public @interface LodaEventDetermine {
    /**
     * Determine whether support loda event
     *
     * @return default {@code ture}
     */
    boolean support() default true;
}
