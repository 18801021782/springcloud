package com.lzx.controller;

import com.lzx.Interface.impl.StudentRepositoryImpl;
import com.lzx.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepositoryImpl studentRepositoryImpl;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findall")
    private Collection<Student> findall(){
        return  studentRepositoryImpl.findall();
    }

    @GetMapping("/findById/{id}")
    private Student findById(@PathVariable("id") long id){
        return  studentRepositoryImpl.findById(id);
    }

    @PostMapping("/save")
    private void save(@RequestBody Student student){
         studentRepositoryImpl.saveOrUpdate(student);
    }

    @GetMapping("/delete/{id}")
    private void delete(@PathVariable("id") Long id){
        studentRepositoryImpl.deleteById(id);
    }

    @GetMapping("/index")
    private String  index(){
        return "访问的服务提供者的端口："+port;
    }

}
