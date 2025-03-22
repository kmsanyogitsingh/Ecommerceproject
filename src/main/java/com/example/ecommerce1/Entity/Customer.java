package com.example.ecommerce1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column( unique =  true,nullable = false,length = 7)
    private int id;
    @Column(name = "cust_name",nullable = false,length = 80)
    private String name;
    @Column( unique =  true,nullable = false)
    private String email;
    @Column( unique =  true,nullable = false,length = 10)
    private String contact;
    @Column( nullable = false)
    private int age;
    @Column( nullable = false)
    private String gender;
    @Column( nullable = false,length = 10)
    private String password;
    @Column( nullable = false,length = 90)
    private String address;

}
