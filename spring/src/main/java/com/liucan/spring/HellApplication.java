package com.liucan.spring;

import com.liucan.spring.beandefinition.IHello;
import com.liucan.spring.loda.LodaScan;
import com.liucan.spring.mode.Country;
import com.liucan.spring.mode.World;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

/**
 * @author liucan
 * @version 2020/8/30
 */
@LodaScan(type = 22)
@SpringBootApplication
public class HellApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HellApplication.class, args);
        System.out.println(context.getBean(World.class).toString());
        int beanDefinitionCount = context.getBeanFactory().getBeanDefinitionCount();
        Country bean1 = context.getBean(Country.class);
        context.getBean(Country.class).test();
        IHello bean = context.getBean(IHello.class);
        List<String> userNames = bean.getUserNames();
        System.out.println(userNames);
    }
}
