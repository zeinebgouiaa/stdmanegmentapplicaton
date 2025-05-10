package tn.iit.myfirstspringapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.iit.myfirstspringapplication.models.StudentSubject;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Long> {
    // Basic CRUD operations are inherited
}