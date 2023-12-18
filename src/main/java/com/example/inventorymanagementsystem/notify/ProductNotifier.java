package com.example.inventorymanagementsystem.notify;

import com.example.inventorymanagementsystem.enitity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductNotifier implements Notify {
    @Override
    public void notify(Product product) {
        System.out.println(product.getQuantity() + " quantity of product " + product.getName() + " has been added!!!");
    }
}
