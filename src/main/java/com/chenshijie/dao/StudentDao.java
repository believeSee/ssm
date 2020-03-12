package com.chenshijie.dao;

import com.chenshijie.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    public void insertStudent(Student user);
    public void deleteStudent(@Param("studentId") int id);
    public void updateStudent(Student student);
    public Student queryOneStudent(@Param("studentId") int id);
    public List<Student> queryAllStudent();
    public Student searchByName(@Param("name") String name);
}
