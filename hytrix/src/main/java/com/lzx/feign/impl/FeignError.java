package com.lzx.feign.impl;

import com.lzx.entity.Student;
import com.lzx.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 * @Param $param$
 * @return $return$
 **/
@Component
public class FeignError implements FeignProviderClient{
    @Override
    public Collection<Student> findall() {
        return null;
    }

    @Override
    public String index() {
        return "服务维护中。。。。";
    }
}
