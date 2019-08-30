package com.lzx.Interface.impl;

import com.lzx.Interface.StudentRepository;
import com.lzx.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Author mengzq
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/
@Repository
public  class StudentRepositoryImpl implements StudentRepository{
    private static HashMap<Long,Student> StudentMap ;
    static{
        StudentMap = new HashMap<>();
        StudentMap.put(1L,new Student(1L,"张三",12));
        StudentMap.put(2L,new Student(2L,"李四",13));
        StudentMap.put(3L,new Student(3L,"王五",14));
    }

    @Override
    public Collection<Student> findall() {
        return StudentMap.values();
    }

    @Override
    public Student findById(long id) {
        return StudentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        StudentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        StudentMap.remove(id);
    }
}
