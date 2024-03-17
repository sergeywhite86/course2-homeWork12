package com.white.course2homework12.service;

import com.white.course2homework12.entity.Cart;
import com.white.course2homework12.entity.Product;
import com.white.course2homework12.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    private final ProductRepository repository;

    private final Cart cart;
    @Override
    public void add(List<Long> idProducts) {
        List<Product> productList = new ArrayList<>();
        idProducts.forEach(p->productList.add(repository.getById(p)));
        cart.getProducts().addAll(productList);
    }
    @Override
    public List<Product> getProductsInCart() {
        return cart.getProducts();
    }

}
