package com.lzx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/
@RestController
@RequestMapping("/native")
public class NativeClientController {
    @Value("${server.port}")
    private  String port ;
    @Value("${foo}")
    private  String foo ;

    @GetMapping("/port")
    private String getPort(){
        return port+"-"+foo;
    }


}
