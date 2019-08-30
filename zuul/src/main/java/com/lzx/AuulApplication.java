package com.lzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/
//生成网关的代理
//自动装配实现的方式
@EnableZuulProxy
@EnableAutoConfiguration
public class AuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuulApplication.class,args);
    }
}
