package ru.daitbegov.everydaycoffee2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "inventory")
@AllArgsConstructor
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id", nullable = false)
//    private Product product;

    @Column(nullable = false)
    private Integer quantity;
//Тоже обсудить
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_updated", nullable = false)
    @org.hibernate.annotations.UpdateTimestamp
    private Date lastUpdated;

    public Inventory() {
    }
}
