package com.olivierloukombo.springboot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
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
