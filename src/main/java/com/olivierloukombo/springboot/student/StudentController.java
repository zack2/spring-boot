package com.olivierloukombo.springboot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController()
@RequestMapping(path="api/v1/students")
public class StudentController {

    @GetMapping("/")
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "zack",
                        "olivierloukombo@gmail.com",
                        LocalDate.of(2021, Month.APRIL, 14),
                        2)
        );
    }
}
