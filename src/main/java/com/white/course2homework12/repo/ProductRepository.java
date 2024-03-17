package com.white.course2homework12.repo;

import com.white.course2homework12.entity.Product;


import java.util.List;

public interface ProductRepository {
    void add(Product product);
    List<Product> findAll();

    Product getById(Long id);

    void deleteById(Long id);
}
