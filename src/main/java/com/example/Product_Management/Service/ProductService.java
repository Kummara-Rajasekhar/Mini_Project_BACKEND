package com.example.Product_Management.Service;

import com.example.Product_Management.Model.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProduct(Integer id);
    public String deleteProduct(Integer id);

    Product eidtProduct(Product product, Integer id);
}
