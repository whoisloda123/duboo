package com.liucan.spring.loda;

import com.liucan.spring.loda.event.LodaEventDetermine;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * scan {@link Loda} components to spring ioc container
 *
 * @author liucan
 * @see LodaComponentScan
 * @see LodaEventDetermine
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@LodaComponentScan
@LodaEventDetermine
public @interface LodaScan {
    /**
     * Alias for {@link #basePackages()} attribute ,Allows for more concise annotation
     * declarations e.g.: {@code @LodaScan("org.my.pkg")} instead of
     * {@code @LodaScan(basePackages="org.my.pkg")}.
     *
     * @return base packages to scan
     */
    @AliasFor(annotation = LodaComponentScan.class)
    String[] value() default {};

    /**
     * Base packages to scan for annotated loda {@link #value()} is an
     * alias for for the attribute
     *
     * @return base packages to scan
     */
    @AliasFor(annotation = LodaComponentScan.class)
    String[] basePackages() default {};

    /**
     * Type-safe alternative to {@link #basePackages()} for specifying the packages to
     * scan for annotated servlet components. The package of each class specified will be
     * scanned.
     *
     * @return classes from the base packages to scan
     */
    @AliasFor(annotation = LodaComponentScan.class)
    Class<?>[] basePackageClasses() default {};

    /**
     * Determine whether support loda event
     *
     * @return default {@code ture}
     */
    @AliasFor(annotation = LodaEventDetermine.class)
    boolean support() default true;
}
