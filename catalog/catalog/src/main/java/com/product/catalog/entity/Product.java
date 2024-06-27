package com.product.catalog.entity;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product {
    private String name;
    private Double price;
    private String category;
}
