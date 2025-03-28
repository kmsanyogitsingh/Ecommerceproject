package com.example.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ecommerce1.entity.Vendor;

@Repository
public interface VendorReposit extends JpaRepository<Vendor, Integer> {
    // @Query(value = "SELECT name, email, contact, address FROM Vendor WHERE id = :id", nativeQuery = true)
    // public List<Object[]> getPartialData(@Param("id") int id);
    @Query("select v.name, v.email, v.contact,v.address from Vendor v where v.id = :id")
    public List<Object[]> getPartialData(@Param("id") int id);
    
    

}
