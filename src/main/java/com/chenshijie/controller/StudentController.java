package com.chenshijie.controller;
import com.chenshijie.entity.Student;
import com.chenshijie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/studentController")
public class StudentController {

    /*controller调用service层*/
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public String getAllStudent(Model model) {
        List<Student> studentList = studentService.queryAllStudent();
        model.addAttribute("studentList", studentList);
        return "allStudent";
    }

    @RequestMapping("/toInsertOneStudent")
    public String toInsertOneStudent() {
        return "insertOneStudent";
    }

    @RequestMapping("/insertOneStudent")
    public String insertOneStudent(Student student) {
        studentService.insertStudent(student);
        return "redirect:/studentController/getAllStudent";
    }

    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id, Model model) {
        Student student = studentService.queryOneStudent(id);
        model.addAttribute("updateStudent", student);
        return "updatePage";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student) {
        studentService.updateStudent(student);
        return "redirect:/studentController/getAllStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id) {
        studentService.deleteStudent(id);
        return "redirect:/studentController/getAllStudent";
    }

    @RequestMapping("/searchByName")
    public String searchByName(String name, Model model) {
        Student student = studentService.searchByName(name);
        List<Student> studentList = new ArrayList<>();

        if (student == null) {
            studentList = studentService.queryAllStudent();
            model.addAttribute("error", "not find");
        }else{
            studentList.add(student);
        }

        model.addAttribute("studentList", studentList);
        return "allStudent";
    }

}
