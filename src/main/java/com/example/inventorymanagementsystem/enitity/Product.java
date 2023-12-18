package com.example.inventorymanagementsystem.enitity;

import lombok.Getter;

@Getter
public class Product {
    private String id;
    private String name;
    private String brand;
    private String category;
    private Integer quantity;
    private Integer price;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
