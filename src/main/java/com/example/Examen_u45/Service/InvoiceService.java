package com.example.Examen_u45.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen_u45.Repository.InvoiceRepository;
import com.example.Examen_u45.model.Invoice;


@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository repository;

    public List<Invoice> all() {
        return repository.findAll();
    }
    
}
