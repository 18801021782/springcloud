package com.lzx.controller;

import com.lzx.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 * @Param $param$
 * @return $return$
 **/
@RestController
@RequestMapping("ribbon")
public class RibbonConller {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findall")
    private Collection<Student> findall(){
        return restTemplate.getForObject("http://provider/student/findall",Collection.class);
    }

    @GetMapping("/findById/{id}")
    private Student findById(@PathVariable("id") Long id){
        return restTemplate.getForObject("http://provider/student/findById/{id}",Student.class,id);
    }

    @GetMapping("/index")
    private String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }

}
