package com.lzx.controller;

import com.lzx.entity.Student;
import com.lzx.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 * @Param $param$
 * @return $return$
 **/

@RestController
@RequestMapping("/fegin")
public class FeignController {

    @Autowired
    private FeignProviderClient client;

    @GetMapping("/findall")
    public Collection<Student> findall(){
      return   client.findall();
    }

    @GetMapping("/index")
    public String index(){
        return   client.index();
    }




}
