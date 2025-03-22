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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( unique =  true,nullable = false,length = 7)
    private int id;
    @Column( name = "Product_Name",nullable = false,length = 70)
    private String name;
    @Column( nullable = false)
    private String category;
    @Column( length = 40)
    private String Description;
    @Column( nullable = false)
    private String Price;
    @Column( nullable = false)
    private int rating;

}
