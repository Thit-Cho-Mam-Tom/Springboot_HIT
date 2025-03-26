package org.example.btvn_buoi3.Repository;

import org.example.btvn_buoi3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
