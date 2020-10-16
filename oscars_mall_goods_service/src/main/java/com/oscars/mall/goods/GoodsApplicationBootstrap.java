package com.oscars.mall.goods;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/10/16  15:44
 * @description :
 */
@SpringBootApplication
@MapperScan( basePackages = {"com.oscars.mall.goods.mapper"})
@ComponentScan( basePackages = {"com.oscars"})
@EnableDubbo
public class GoodsApplicationBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplicationBootstrap.class,args);
    }

}
