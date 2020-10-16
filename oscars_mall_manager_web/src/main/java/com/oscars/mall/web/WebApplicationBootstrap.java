package com.oscars.mall.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/10/16  16:46
 * @description :
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.oscars"})
@EnableDubbo
public class WebApplicationBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(WebApplicationBootstrap.class,args);
    }
}
