package com.chenshijie.service;

import com.chenshijie.dao.StudentDao;
import com.chenshijie.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    /*业务层调dao层
    * 所以需要将到层组合进来
    * */
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public Student queryOneStudent(int id) {
        return studentDao.queryOneStudent(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }

    @Override
    public Student searchByName(String name) {
        return studentDao.searchByName(name);
    }
}
