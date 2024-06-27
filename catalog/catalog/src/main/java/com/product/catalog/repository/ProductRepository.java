package com.product.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.catalog.entity.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}