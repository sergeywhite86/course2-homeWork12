package com.white.course2homework12.repo;

import com.white.course2homework12.entity.Product;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Getter
@RequiredArgsConstructor
public class DBStore {
    private final List<Product> dBProducts;

    @PostConstruct
    private void init() {
        dBProducts.add(new Product("bred", 70));
        dBProducts.add(new Product("milk", 90));
        dBProducts.add(new Product("eggs", 125));

    }
}
