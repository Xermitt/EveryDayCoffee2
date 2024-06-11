package ru.daitbegov.everydaycoffee2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@AllArgsConstructor
@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //добавить в бд
    @Column(nullable = false, unique = true)
    private int phone;

    //как лучше сделать, чтобы можно было оставить пустым или нельзя ?
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String email;


    @Column(nullable = false)
    private String role;

    @Column(name = "discount_percentage", nullable = false)
    private Double discountPercentage = 0.0;
//здесь не до конца все понимаю, хорошо было бы обговорить
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Order> orders;

    public User() {
    }
}
