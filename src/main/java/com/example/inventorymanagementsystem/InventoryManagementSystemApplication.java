package com.example.inventorymanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Convention over Config, annotation
@SpringBootApplication
public class InventoryManagementSystemApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(InventoryManagementSystemApplication.class, args);
    }
}
