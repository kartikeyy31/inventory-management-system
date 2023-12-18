package com.example.inventorymanagementsystem.searcher;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryBasedSearcher implements Searcher {
    private final ProductRepository productRepository;

    public CategoryBasedSearcher(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> search(String category) {
        return productRepository.searchByCategory(category);
    }
}
