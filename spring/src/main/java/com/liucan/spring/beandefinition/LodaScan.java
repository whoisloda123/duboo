package com.liucan.spring.beandefinition;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author liucan
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Import(LodaScanAnnotationBeanDefinitionRegistrar.class)
public @interface LodaScan {
    /**
     * the package name to be scanned
     *
     * @return package name
     */
    String value() default "";
}
