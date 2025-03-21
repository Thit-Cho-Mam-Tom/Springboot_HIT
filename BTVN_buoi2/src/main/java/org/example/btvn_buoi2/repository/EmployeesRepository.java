package org.example.btvn_buoi2.repository;

import org.example.btvn_buoi2.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}
