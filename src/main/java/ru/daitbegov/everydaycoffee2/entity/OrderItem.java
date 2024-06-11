package ru.daitbegov.everydaycoffee2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "order_items")
@AllArgsConstructor
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//тоже нужно проговорить
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id", nullable = false)
//    private Order order;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id", nullable = false)
//    private Product product;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Double price;

    public OrderItem() {
    }
}
