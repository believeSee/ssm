package com.chenshijie.service;

import com.chenshijie.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    public void insertStudent(Student user);
    public void deleteStudent(@Param("studentId") int id);
    public void updateStudent(Student student);
    public Student queryOneStudent(@Param("studentId") int id);
    public List<Student> queryAllStudent();
    public Student searchByName(String name);
}
