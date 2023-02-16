package com.example.Examen_u45.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen_u45.Service.CustomerService;
import com.example.Examen_u45.model.Customer;



@RestController
@RequestMapping("/api/customers")

public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping()
    public List<Customer> all() {
        return service.all();
    }
    
}
