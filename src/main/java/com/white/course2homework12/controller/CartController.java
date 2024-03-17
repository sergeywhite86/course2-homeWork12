package com.white.course2homework12.controller;


import com.white.course2homework12.entity.Product;
import com.white.course2homework12.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    @PostMapping("/add")
    public void add(@RequestParam List<Long> id){
        cartService.add(id);
    }

    @GetMapping("/get")
    public List<Product> findAll(){
       return cartService.getProductsInCart();
    }
}
