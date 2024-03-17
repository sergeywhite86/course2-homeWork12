package com.white.course2homework12.service;

import com.white.course2homework12.entity.Product;

import java.util.List;

public interface ProductService {
    void add(String title,double price);
    List<Product> findAll();

    Product getById(Long id);

    void deleteById(Long id);
}
