package com.example.ecommerce1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.ecommerce1.entity.Product;

@Repository
public interface ProductReposit extends JpaRepository<Product, Integer> {
    // @Query(value = "SELECT * FROM Product WHERE name = :name", nativeQuery =
    // true)

    // public List<Product> getProductByName(@Param("name") String name);

    // @Query(value = "SELECT * FROM Product WHERE category = :category",
    // nativeQuery = true)

    // public List<Product> getProductByCategory(@Param("category") String
    // category);
     // @Query(value = "SELECT * FROM product WHERE name = :name AND category =
     //:category", nativeQuery = true)
     // public List<Product> getProductByNameAndCategory(@Param("name") String
    // name, @Param("category") String category);

   
    @Query("select p from Product p where p.name = :name")
    public List<Product> getProductByName(@Param("name") String name);

    @Query("select u from Product u where u.Category = :category")
    public List<Product> getProductByCategory(@Param("category") String category);

    // @Query("select p from Product p where p.name = :name AND p.category =
    // :category")
    // public List<Product> getProductByNameAndCategory(@Param("name") String name,
    // @Param("category") String category);

}
