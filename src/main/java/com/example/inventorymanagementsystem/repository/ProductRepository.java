package com.example.inventorymanagementsystem.repository;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.notify.ProductNotifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class ProductRepository {
    HashMap<String, Product> productDetails = new HashMap<> ();
    private final ProductNotifier productNotifier;

    public ProductRepository(ProductNotifier productNotifier) {
        this.productNotifier = productNotifier;
    }

    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();

        for (HashMap.Entry<String, Product> entry : productDetails.entrySet()) {
            Product product = entry.getValue();
            products.add(product);
        }

        return products;
    }

    public Product addProduct(Product product) {
        String productId = String.valueOf(productDetails.size());
        product.setId(productId);
        productDetails.put(productId, product);
        productNotifier.notify(product);
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
