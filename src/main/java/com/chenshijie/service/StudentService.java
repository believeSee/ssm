package com.chenshijie.service;

import com.chenshijie.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    public void insertUser(Student user);
    public void deleteUser(@Param("studentId") int id);
    public void updateUser(Student user);
    public Student queryOneUser(@Param("studentId") int id);
    public List<Student> queryAllUser();
}
