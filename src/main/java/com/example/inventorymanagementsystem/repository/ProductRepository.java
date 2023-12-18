package com.example.inventorymanagementsystem.repository;

import com.example.inventorymanagementsystem.enitity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.HashMap;

@Component
public class ProductRepository {
    HashMap<String, Product> productDetails = new HashMap<> ();

    public Product addProduct(Product product) {
        String productId = String.valueOf(productDetails.size());
        product.setId(productId);
        productDetails.put(productId, product);
        return product;
    }

    public Product findById(String productId) {
        if (productDetails.containsKey(productId))
            return productDetails.get(productId);

        return null;
    }

    public void delete(String productId) {
        if (this.findById(productId) != null)
            productDetails.remove(productId);
        else
            throw new IllegalArgumentException("this product id doesn't exists");
    }
}
