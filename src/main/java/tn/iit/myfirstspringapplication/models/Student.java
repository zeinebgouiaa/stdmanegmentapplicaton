package tn.iit.myfirstspringapplication.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<StudentSubject> subjectList;
    private double average;
}
