package com.liucan.spring.config;

import com.liucan.spring.World;
import com.liucan.spring.beandefinition.HelloBeanDefinitionRegistryPostProcessor;
import com.liucan.spring.postprocessor.Country;
import com.liucan.spring.postprocessor.CountryBeanPostProcessor;
import com.liucan.spring.postprocessor.HelloValueAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liucan
 * @version 2020/8/30
 */
@Configuration
public class CommonConfig {
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
