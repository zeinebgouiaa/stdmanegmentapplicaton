package tn.iit.myfirstspringapplication.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double mark;

    @ManyToOne
    private Student student;
}