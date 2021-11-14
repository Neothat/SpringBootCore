package com.geekbrains.bootstrap.Products.controllers;

import com.geekbrains.bootstrap.Products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControler {

    ProductRepository productRepository;

    @GetMapping("/allProducts")
    public String showPageWithAllProducts(Model model){
        model.addAttribute("products", productRepository.findAllProducts());
        return "products_page";
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
