package tn.iit.myfirstspringapplication.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentUpdateDTO {
    private String name;
    private Integer age;
    private Double averageGrade;
}