package com.example.Examen_u45.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen_u45.Repository.CustomerRepository;
import com.example.Examen_u45.model.Customer;



@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> all() {
        return repository.findAll();
    }
}
