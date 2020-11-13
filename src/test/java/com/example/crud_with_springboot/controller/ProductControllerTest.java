package com.example.crud_with_springboot.controller;

import com.example.crud_with_springboot.repository.ProductRepository;
import com.example.crud_with_springboot.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void addProduct() {
    }

    @Test
    void addProducts() {
    }

    @Test
    void findAllProducts() {
    }

    @Test
    void findProductById() {
    }

    @Test
    void findProductByName() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProduct() {
    }
}