package com.white.course2homework12.repo;

import com.white.course2homework12.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final DBStore data;

    @Override
    public void add(Product product) {
        data.getDBProducts().add(product);
    }

    @Override
    public List<Product> findAll() {
        return data.getDBProducts();
    }

    @Override
    public Product getById(Long id) {
        return data.getDBProducts().stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public void deleteById(Long id) {
        data.getDBProducts().removeIf(p -> p.getId().equals(id));
    }

}
