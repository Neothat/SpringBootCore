package com.geekbrains.bootstrap.Products.repository;

import com.geekbrains.bootstrap.Products.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository {
    Product findProductById(Long id);

    List<Product> findAllProducts();
}
