package com.liucan.spring.mode;

import com.liucan.spring.loda.LodaAutowired;
import com.liucan.spring.universe.HelloValue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author liucan
 * @version 2020/8/30
 */
public class World implements EnvironmentAware, ApplicationContextAware, ResourceLoaderAware, BeanNameAware, InitializingBean, DisposableBean {

    private ApplicationContext applicationContext;

    private Environment environment;

    private ResourceLoader resourceLoader;

    @HelloValue("中国")
    private String ContoryName;

    /**
     * name that indicates which user has used
     */
    private String userName;

    @LodaAutowired
    private Country country;

    @Override
    public void setBeanName(String name) {
        System.out.println(String.format("setBeanName:%s", name));
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        country.test();
        System.out.println("afterPropertiesSet");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy1() {
        System.out.println("PreDestroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
        this.applicationContext = applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        System.out.println("setEnvironment");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        System.out.println("setResourceLoader");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContoryName() {
        return ContoryName;
    }

    public void setContoryName(String contoryName) {
        ContoryName = contoryName;
    }

    public String getUserName() {
        return userName;
    }
}
