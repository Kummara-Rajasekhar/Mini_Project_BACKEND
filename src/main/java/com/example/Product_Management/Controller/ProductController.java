package com.example.Product_Management.Controller;

import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;


    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);

    }
     @GetMapping("/")
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id) {
        return  new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @GetMapping("/deleteProduct/{id")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product deleted Successfully", HttpStatus.OK);
    }
    @PostMapping("/editProduct")
    public ResponseEntity<?> editProduct(@RequestBody Product product,@PathVariable Integer id) {
        return new ResponseEntity<>(productService.saveProduct(product,id), HttpStatus.CREATED);
    }

}
