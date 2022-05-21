package com.olivierloukombo.springboot.student;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

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
    Integer age;

    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
