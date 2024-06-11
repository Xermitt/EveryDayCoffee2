package ru.daitbegov.everydaycoffee2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.daitbegov.everydaycoffee2.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
