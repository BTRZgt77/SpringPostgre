package com.example.Examen_u45.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "customer")

public class Customer {

    @Id
    private int customer_id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String company;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String postal_code;
    @Column
    private String phone;
    @Column
    private String fax;
    @Column
    private String email;
    @ManyToOne
    @JoinColumn(name = "support_rep_id")
    private Employee employee;

}
