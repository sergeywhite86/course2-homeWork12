package com.white.course2homework12.entity;

import lombok.Data;

@Data
public class Product {
    private static long countId;
    private Long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        countId ++;
        this.id = countId;
    }
}


