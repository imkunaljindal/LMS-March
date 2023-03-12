package com.backendMarch.librarymanagementsystem.Controller;

import com.backendMarch.librarymanagementsystem.Entity.Student;
import com.backendMarch.librarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student has been added";
    }
}
