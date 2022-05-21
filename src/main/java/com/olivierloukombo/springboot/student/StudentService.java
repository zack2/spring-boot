package com.olivierloukombo.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        if(studentRepository.findByEmail(student.getEmail()).isPresent())
            throw new IllegalStateException("Email already exist");
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        if(!studentRepository.existsById(studentId))
            throw new IllegalArgumentException("Student with id " + studentId +  " doesn't exist");
        studentRepository.deleteById(studentId);

    }
}
