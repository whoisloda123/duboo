package com.liucan.spring;

import com.liucan.spring.loda.LodaScan;
import com.liucan.spring.loda.event.LiucanLodaEvent;
import com.liucan.spring.loda.event.LodaEventPublisher;
import com.liucan.spring.mode.Country;
import com.liucan.spring.mode.Town;
import com.liucan.spring.mode.World;
import com.liucan.spring.universe.EnableUniverse;
import com.liucan.spring.universe.IHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

/**
 * @author liucan
 * @version 2020/8/30
 */
@LodaScan
@EnableUniverse
@SpringBootApplication
public class HellApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HellApplication.class, args);
        System.out.println(context.getBean(World.class).toString());
        int beanDefinitionCount = context.getBeanFactory().getBeanDefinitionCount();
        Country bean1 = context.getBean(Country.class);
        context.getBean(Country.class).test();

        //Object bean3 = context.getBean("townFactoryBean");
        Town bean2 = context.getBean(Town.class);

        IHello bean = context.getBean(IHello.class);
        if (bean != null) {
            List<String> userNames = bean.getUserNames();
            System.out.println(userNames);
        }

        LodaEventPublisher lodaEventPublisher = context.getBean(LodaEventPublisher.class);
        lodaEventPublisher.publishEvent(new LiucanLodaEvent(context, bean1));
    }
}
