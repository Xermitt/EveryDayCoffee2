package ru.daitbegov.everydaycoffee2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.daitbegov.everydaycoffee2.entity.Product;
import ru.daitbegov.everydaycoffee2.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Другие методы, например, для добавления, обновления и удаления продуктов
}
