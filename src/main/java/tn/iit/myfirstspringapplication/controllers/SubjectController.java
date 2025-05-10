package tn.iit.myfirstspringapplication.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.iit.myfirstspringapplication.services.StudentSubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
    private final StudentSubjectService subjectService;

    public SubjectController(StudentSubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSubject(@PathVariable Long id) {
        try {
            subjectService.deleteSubject(id);
            return ResponseEntity.ok("Subject with ID " + id + " was deleted successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}