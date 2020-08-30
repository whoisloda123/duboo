package com.liucan.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liucan
 * @version 2020/8/30
 */
@SpringBootApplication
public class HellApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HellApplication.class, args);
        System.out.println(context.getBean(World.class).toString());

        context.getBean(Country.class).test();
    }
}
