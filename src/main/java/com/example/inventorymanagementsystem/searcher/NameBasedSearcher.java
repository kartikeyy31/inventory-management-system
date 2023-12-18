package com.example.inventorymanagementsystem.searcher;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NameBasedSearcher implements Searcher {
    private final ProductRepository productRepository;

    public NameBasedSearcher(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> search(String name) {
        return productRepository.searchByName(name);
    }
}
