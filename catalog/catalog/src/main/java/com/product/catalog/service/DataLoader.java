package com.product.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.product.catalog.entity.Product;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = productService.getAllProducts();
        products.forEach(product -> System.out.println(product.getName()));
        products.forEach(product -> System.out.println(product.getCategory()));
        System.out.println(products);
    }
}
