package com.example.inventorymanagementsystem.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequest {
    private String name;
    private String brand;
    private String category;
    private Integer quantity;
    private Integer price;
}
