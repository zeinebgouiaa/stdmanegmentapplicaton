package tn.iit.myfirstspringapplication.services;

import org.springframework.stereotype.Service;
import tn.iit.myfirstspringapplication.DTO.StudentCreateDTO;
import tn.iit.myfirstspringapplication.DTO.StudentUpdateDTO;
import tn.iit.myfirstspringapplication.models.Student;
import tn.iit.myfirstspringapplication.repositories.StudentRepository;

//import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(StudentCreateDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setAverageGrade(studentDTO.getAverageGrade());
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, StudentUpdateDTO studentDTO) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        if (studentDTO.getName() != null) {
            student.setName(studentDTO.getName());
        }
        if (studentDTO.getAge() != null) {
            student.setAge(studentDTO.getAge());
        }
        if (studentDTO.getAverageGrade() != null) {
            student.setAverageGrade(studentDTO.getAverageGrade());
        }

        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }
}