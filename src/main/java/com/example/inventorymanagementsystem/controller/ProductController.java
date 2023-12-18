package com.example.inventorymanagementsystem.controller;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.repository.ProductRepository;
import com.example.inventorymanagementsystem.requests.CreateProductRequest;
import com.example.inventorymanagementsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ims")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/addProduct")
    public Product addProduct(CreateProductRequest createProductRequest) {
        return productService.addProduct(createProductRequest);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable String productId) {
        try {
            productService.deleteProduct(productId);
            return "Product deleted successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
