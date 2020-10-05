package com.liucan.spring.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

import java.util.Arrays;

/**
 * 作用和 {@link ImportBeanDefinitionRegistrar} 是一样的，动态注入bean，只是需要通过import引入才行
 *
 * @author liucan
 * @version 2020/8/30
 * @see #postProcessBeanDefinitionRegistry
 */
public class HelloBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    /**
     * 动态注入 {@link IHello} bean
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) BeanDefinitionBuilder
                .genericBeanDefinition(IHello.class)
                .getRawBeanDefinition();
        MutablePropertyValues propertyValues = genericBeanDefinition.getPropertyValues();
        propertyValues.add("userNames", Arrays.asList("liucan", "canliu"));
        propertyValues.add("interfaceClass", IHello.class);
        genericBeanDefinition.setBeanClass(ServiceFactoryBean.class);
        genericBeanDefinition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_BY_TYPE);

        registry.registerBeanDefinition(IHello.class.getSimpleName(), genericBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    }
}
