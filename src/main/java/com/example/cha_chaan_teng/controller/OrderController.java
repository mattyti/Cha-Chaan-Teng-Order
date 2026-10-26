package com.example.cha_chaan_teng.controller;

import com.example.cha_chaan_teng.entities.Order;
import com.example.cha_chaan_teng.repositories.OrderRepository;
import com.example.cha_chaan_teng.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*") // 解鎖前端存取權限
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    /**
     * [GET] 獲取所有訂單
     * API: GET /api/orders
     */
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /**
     * [POST] 提交新訂單
     * API: POST /api/orders
     */
    @PostMapping
    public Order submitOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
//
    /**
     * [PUT] 更新訂單狀態 (出餐/結帳)
     * API: PUT /api/orders/{id}/status?status=COMPLETED
     */
    @PutMapping("/{id}/status")
    public Order updateOrderStatus(@PathVariable Long id, @RequestParam String status) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("找不到該訂單！單號：" + id));

        order.setStatus(status);
        return orderRepository.save(order);
    }
}