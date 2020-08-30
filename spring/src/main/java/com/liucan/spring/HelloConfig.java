package com.liucan.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liucan
 * @version 2020/8/30
 */
@Configuration
public class HelloConfig {
    @Bean
    public World world() {
        World world = new World();
        world.setUserName("fsfsfs");
        return world;
    }

    @Bean
    public Country country() {
        return new Country();
    }

    @Bean
    public HelloValueAnnotationBeanPostProcessor helloValueAnnoationBeanPostProcessor() {
        return new HelloValueAnnotationBeanPostProcessor();
    }

    @Bean
    public CountryBeanPostProcessor worldBeanPostProcessor() {
        return new CountryBeanPostProcessor();
    }

    @Bean
    public HelloBeanDefinitionRegistryPostProcessor helloBeanDefinitionRegistryPostProcessor() {
        return new HelloBeanDefinitionRegistryPostProcessor();
    }
}
