package com.example.Product_Management.Repository;

import com.example.Product_Management.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
