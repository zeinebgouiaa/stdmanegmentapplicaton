package tn.iit.myfirstspringapplication.controllers;

import org.springframework.web.bind.annotation.*;
import tn.iit.myfirstspringapplication.DTO.StudentCreateDTO;
import tn.iit.myfirstspringapplication.DTO.StudentUpdateDTO;
import tn.iit.myfirstspringapplication.models.Student;
import tn.iit.myfirstspringapplication.services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("")
    public Student createStudent(@RequestBody StudentCreateDTO student){
        return studentService.createStudent(student);
    }

    @PutMapping("{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody StudentUpdateDTO studentDTO){
        return studentService.updateStudent(id, studentDTO);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
