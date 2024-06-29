package com.product.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.product.catalog.entity.Product;
import com.product.catalog.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {
	
    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {    	
        productRepository.save(product);        
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
       
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

}
