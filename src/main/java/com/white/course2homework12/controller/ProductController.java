package com.white.course2homework12.controller;

import com.white.course2homework12.entity.Product;
import com.white.course2homework12.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }


    @PutMapping("/add")
    public void add(@RequestParam String title,@RequestParam double price) {
        service.add(title,price);
    }
    @GetMapping("byId")
    public Product getById(@RequestParam Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete")
    public void deleteById(@RequestParam Long id) {
        service.deleteById(id);
    }
}
