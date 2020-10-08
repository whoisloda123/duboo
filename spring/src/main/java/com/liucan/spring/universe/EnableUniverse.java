package com.liucan.spring.universe;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Enable universe
 *
 * @author liucan
 * @see UniverseConfigurationSelector
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(UniverseConfigurationSelector.class)
public @interface EnableUniverse {
    /**
     * Determine whether create {@link IHello} proxy class
     * default {@code true}
     */
    boolean helloProxy() default true;
}
