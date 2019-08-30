package com.lzx.Interface;

import com.lzx.entity.Student;

import java.util.Collection;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 * @Param $param$
 * @return $return$
 **/

public interface StudentRepository {
    public Collection<Student> findall();

    public Student findById(long id);

    public void  saveOrUpdate(Student student);

    public void deleteById (long id);

}
