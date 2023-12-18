package com.example.inventorymanagementsystem.searcher;

import com.example.inventorymanagementsystem.enitity.Product;

import java.util.List;

public interface Searcher {
    public List<Product> search(String name);
}
