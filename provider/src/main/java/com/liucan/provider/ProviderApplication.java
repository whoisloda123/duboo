package com.liucan.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liucan
 * @version 2020/8/23
 */
@EnableDubbo(scanBasePackages = "com.liucan.provider")
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ProviderApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
