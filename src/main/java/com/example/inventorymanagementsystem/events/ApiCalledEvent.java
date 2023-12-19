package com.example.inventorymanagementsystem.events;

import com.example.inventorymanagementsystem.enitity.Product;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class ApiCalledEvent extends ApplicationEvent {
    private String message;

    public ApiCalledEvent(Object source, Product product) {
        super(source);
        this.message = product.getQuantity() + " quantity of product " + product.getName() + " has been added!!!";
    }
}
