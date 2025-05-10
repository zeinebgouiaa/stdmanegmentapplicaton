package tn.iit.myfirstspringapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.myfirstspringapplication.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}