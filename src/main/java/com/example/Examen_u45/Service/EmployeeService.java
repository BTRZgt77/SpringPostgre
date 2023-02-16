package com.example.Examen_u45.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen_u45.Repository.EmployeeRepository;
import com.example.Examen_u45.model.Employee;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> all() {
        return repository.findAll();
    }
}
