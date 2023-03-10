package com.example.Examen_u45.Repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Examen_u45.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findById(int customerId);
}

