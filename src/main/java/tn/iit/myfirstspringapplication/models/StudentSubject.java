package tn.iit.myfirstspringapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "subjects")
@Data
@Getter
@Setter
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double mark;
    private double coefficient;
    @ManyToOne
    @JoinColumn(name="student_id")
    @JsonIgnore
    private Student student;
}
