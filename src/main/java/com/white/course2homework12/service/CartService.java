package com.white.course2homework12.service;

import com.white.course2homework12.entity.Product;
import java.util.List;

public interface CartService {
    void add(List<Long> idProducts);

    List<Product> getProductsInCart();

}
