package com.example.cha_chaan_teng.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String menuName;

    private Integer quantity;

    private Integer subtotal;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnore // 防止轉換 JSON 時發生無限循環 (Order -> Item -> Order...)
    private Order order;
}