package com.example.Examen_u45.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen_u45.Service.InvoiceService;
import com.example.Examen_u45.model.Invoice;



    @RestController
    @RequestMapping("/api/invoice")
    public class InvoiceController {
        @Autowired
        private InvoiceService service;

        @GetMapping()
        public List<Invoice> all() {
            return service.all();
        }

    }
