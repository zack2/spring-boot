package com.olivierloukombo.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{
            Student olivier = new Student(
                    "olivier",
                    "email@gmail.com",
                    LocalDate.of(2021, Month.APRIL, 1)

            );
            Student marc = new Student(
                    "marc",
                    "marc@email.com",
                    LocalDate.of(2005, Month.APRIL, 1)

            );
            studentRepository.saveAll(List.of(olivier, marc));
        };
    }
}
