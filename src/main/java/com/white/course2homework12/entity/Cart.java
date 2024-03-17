package com.white.course2homework12.entity;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Getter
@Component
@SessionScope
public class Cart {
    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>();
    }
}
