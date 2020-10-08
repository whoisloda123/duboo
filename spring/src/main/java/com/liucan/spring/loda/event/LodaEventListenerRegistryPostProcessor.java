package com.liucan.spring.loda.event;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * {@link LodaEventListener} registry
 *
 * @author liucan
 * @date 10/7/20 10:20 PM
 */
public class LodaEventListenerRegistryPostProcessor implements BeanPostProcessor, DestructionAwareBeanPostProcessor {

    private final LodaEventPublisher lodaEventPublisher;

    public LodaEventListenerRegistryPostProcessor(LodaEventPublisher lodaEventPublisher) {
        this.lodaEventPublisher = lodaEventPublisher;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LodaEventListener) {
            lodaEventPublisher.addEventListener((LodaEventListener) bean);
        }
        return bean;
    }

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (bean instanceof LodaEventListener) {
            lodaEventPublisher.removeListener((LodaEventListener) bean);
        }
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        return bean instanceof LodaEventListener;
    }
}