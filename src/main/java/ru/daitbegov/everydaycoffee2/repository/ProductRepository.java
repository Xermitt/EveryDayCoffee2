package ru.daitbegov.everydaycoffee2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.daitbegov.everydaycoffee2.entity.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product save(Product product);

    Optional<Product> findById(Integer id);

    void deleteById(Integer id);

    List<Product> findAll();

    List<Product> findByName(String name);

    List<Product> findByCategory(String category);






}
