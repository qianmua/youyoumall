package com.oscars.mall.seckill;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/10/20  21:08
 * @description :
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan( basePackages = {"com.oscars"})
@MapperScan( basePackages = {"com.oscars.mall.seckill.mapper"})
public class SeckillApplicationBootstrap {
}
