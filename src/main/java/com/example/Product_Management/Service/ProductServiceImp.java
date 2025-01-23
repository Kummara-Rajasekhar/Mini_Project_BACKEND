package com.example.Product_Management.Service;

import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Repository.ProductRepository;

import java.util.List;

public class ProductServiceImp implements ProductService {
    private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
//        return ProductRepository.save(product);
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
        Product product = productRepository.findById(id).get();
        if(product != null){
            productRepository.delete(product);
            return "Product Deleted Successfully";
        }
        return "Something Went Wrong";

    }

    @Override
    public Product eidtProduct(Product product, Integer id) {
        Product product1 = productRepository.findById(id).get();
        product1.setProductName(product.getProductname());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setStatus(product.getStatus());
        return productRepository.save(product1);
    }
}
