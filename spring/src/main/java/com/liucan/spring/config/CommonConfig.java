package com.liucan.spring.config;

import com.liucan.spring.mode.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Common configuration
 *
 * @author liucan
 * @version 2020/8/30
 */
@Configuration
public class CommonConfig {
    @Bean
    public World<String> world() {
        World<String> world = new World();
        world.setUserName("fsfsfs");
        return world;
    }
}
