package tn.iit.myfirstspringapplication.services;

import org.springframework.stereotype.Service;
import tn.iit.myfirstspringapplication.models.StudentSubject;
import tn.iit.myfirstspringapplication.repositories.StudentSubjectRepository;

@Service
public class StudentSubjectService {
    private final StudentSubjectRepository subjectRepository;

    public StudentSubjectService(StudentSubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public void deleteSubject(Long id) {
        StudentSubject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subject not found with ID: " + id));
        subjectRepository.delete(subject);
    }
}