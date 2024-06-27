package com.product.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.product.catalog.entity.Product;
import com.product.catalog.service.ProductService;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/index")
    public String home() {
        return "home";
    }

    @GetMapping("/AddProduct")
    public String addProductForm() {
        return "addProduct";
    }

    @PostMapping("/AddProduct")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/display-products")
    public String displayProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "displayProducts";
    }
}