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
    public void insertUser(Student user) {
        studentDao.insertUser(user);
    }

    @Override
    public void deleteUser(int id) {
        studentDao.deleteUser(id);
    }

    @Override
    public void updateUser(Student user) {
        studentDao.updateUser(user);
    }

    @Override
    public Student queryOneUser(int id) {
        return studentDao.queryOneUser(id);
    }

    @Override
    public List<Student> queryAllUser() {
        return studentDao.queryAllUser();
    }
}
