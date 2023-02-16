package com.example.Examen_u45.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Examen_u45.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findById(int employee_id);
}
