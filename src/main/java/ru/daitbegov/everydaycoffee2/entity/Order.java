package ru.daitbegov.everydaycoffee2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //нужно проговорить
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private Double total;

    //нужно проговорить
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date createdAt;

    public Order() {
    }

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<OrderItem> orderItems;
}
