package be.intecbrussel.springbootdemo3.controller;

import be.intecbrussel.springbootdemo3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("students", studentService.getAll());
        return "index";
    }
}
