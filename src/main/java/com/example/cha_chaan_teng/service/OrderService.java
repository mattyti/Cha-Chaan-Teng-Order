package com.example.cha_chaan_teng.service;

import com.example.cha_chaan_teng.entities.Order;
import com.example.cha_chaan_teng.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 獲取所有訂單
     * @return 訂單列表 (包含所有狀態)
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * 創建新訂單
     * @param order 前端傳入的訂單資料
     * @return 儲存成功後的訂單實體
     */
    public Order createOrder(Order order) {
        if (order.getItems() != null) {
            order.getItems().forEach(item -> item.setOrder(order));
        }
        return orderRepository.save(order);
    }
}