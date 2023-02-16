package com.example.Examen_u45.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen_u45.Service.EmployeeService;
import com.example.Examen_u45.model.Employee;



@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping()
    public List<Employee> all() {
        return service.all();
    }
}
