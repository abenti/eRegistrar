package edu.miu.cs.cs425.eregistrar.controller;

import edu.miu.cs.cs425.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/eregistrar/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = {"/list"}) // /eregistrar/student/list
    public ModelAndView listStudents() {
        var modelAndView = new ModelAndView();
        var students = studentService.getStudents();
        modelAndView.addObject("students", students);
        modelAndView.setViewName("student/list");
        return modelAndView;
    }
}