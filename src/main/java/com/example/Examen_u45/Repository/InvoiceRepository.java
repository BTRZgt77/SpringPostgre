package com.example.Examen_u45.Repository;

import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Examen_u45.model.Invoice;



public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{
    Optional<Invoice> findById(int invoice_id);
    
}
