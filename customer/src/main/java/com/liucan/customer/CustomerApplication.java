package com.liucan.customer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liucan
 * @version 2020/8/23
 */
@EnableDubbo(scanBasePackages = "com.liucan.customer")
@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(CustomerApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
