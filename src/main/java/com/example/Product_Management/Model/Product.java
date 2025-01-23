package com.example.Product_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    public Integer getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String productname;
    private String description;
    private Double price;
    private String status;

    public String getProductname() {
        return productname;
    }



    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }


    public void setProductName(String productname) {
    }

    public void setDescription(String description) {
    }

    public Product() {
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStatus(String status) {
    }
}
