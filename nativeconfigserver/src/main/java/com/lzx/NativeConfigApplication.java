package com.lzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 * @Param $param$
 * @return $return$
 **/
@SpringBootApplication
@EnableConfigServer
public class NativeConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigApplication.class,args);
    }
}
