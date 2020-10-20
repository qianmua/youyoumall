package com.oscars.mall.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/10/20  20:33
 * @description :
 */
@SpringBootApplication
@MapperScan( basePackages = {"com.oscars.mall.order.mapper"})
@EnableDubbo
@ComponentScan( basePackages = {"com.oscars"})
public class OrderApplicationBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationBootstrap.class,args);
    }
}
