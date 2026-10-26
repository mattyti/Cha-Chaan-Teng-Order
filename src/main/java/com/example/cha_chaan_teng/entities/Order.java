package com.example.cha_chaan_teng.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders") // 避免與 SQL 關鍵字 ORDER 衝突
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer totalAmount;
    // 訂單狀態：預設為 PENDING (處理中)，可更新為 COMPLETED (已完成)
    private String status = "PENDING";

    private LocalDateTime orderTime = LocalDateTime.now();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderItem> items;
}