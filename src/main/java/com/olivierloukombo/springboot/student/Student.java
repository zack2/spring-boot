package com.olivierloukombo.springboot.student;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "student_sequence"
            )
    Long id;
    String name;
    String email;
    LocalDate dob;
    @Transient
    Integer age;

    public Student(Long id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
       
    }

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
       
    }
    public Integer getAge(){
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
