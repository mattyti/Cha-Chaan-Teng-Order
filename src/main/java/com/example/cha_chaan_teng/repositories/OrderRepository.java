package com.example.cha_chaan_teng.repositories;

import com.example.cha_chaan_teng.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long > {
}
