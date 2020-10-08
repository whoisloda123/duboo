package com.liucan.spring.loda.event;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Loda event selector
 *
 * @author liucan
 * @date 10/8/20 2:22 PM
 * @see LodaEventDetermine
 */
public class LodaEventSelector implements ImportSelector {
    /**
     * {@link LodaEventDetermine} support parameter
     */
    private static final String EVENT_DETERMINE_PARAMETER = "support";

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        AnnotationAttributes attributes = AnnotationAttributes
                .fromMap(importingClassMetadata.getAnnotationAttributes(LodaEventDetermine.class.getName()));
        if (attributes.getBoolean(EVENT_DETERMINE_PARAMETER)) {
            return new String[]{LodaEventListenerRegistryPostProcessor.class.getName(), LodaEventPublisher.class.getName()};
        }
        return new String[0];
    }
}
