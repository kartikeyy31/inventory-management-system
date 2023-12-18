package com.example.inventorymanagementsystem.service;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.repository.ProductRepository;
import com.example.inventorymanagementsystem.requests.CreateProductRequest;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Getter
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(CreateProductRequest createProductRequest) {
        Product product = new Product();
        product.setName(createProductRequest.getName());
        product.setBrand(createProductRequest.getBrand());
        product.setCategory(createProductRequest.getCategory());
        product.setPrice(createProductRequest.getPrice());
        product.setQuantity(createProductRequest.getQuantity());
        return productRepository.addProduct(product);
    }

    public void deleteProduct(String productId) throws Exception {
        productRepository.delete(productId);
    }
}
