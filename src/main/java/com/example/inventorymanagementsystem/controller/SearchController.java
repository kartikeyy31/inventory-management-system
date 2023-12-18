package com.example.inventorymanagementsystem.controller;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.enitity.SearchCondition;
import com.example.inventorymanagementsystem.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("name/{name}")
    public List<Product> searchByProductName(@PathVariable String name) {
        return searchService.search(name, SearchCondition.NAME);
    }

    @GetMapping("brand/{brand}")
    public List<Product> searchByProductBrand(@PathVariable String brand) {
        return searchService.search(brand, SearchCondition.BRAND);
    }

    @GetMapping("category/{category}")
    public List<Product> searchByProductCategory(@PathVariable String category) {
        return searchService.search(category, SearchCondition.CATEGORY);
    }
}
