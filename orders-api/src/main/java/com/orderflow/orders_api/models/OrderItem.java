package com.orderflow.orders_api.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    private Order order;
    private UUID productId;
    private String productName;
    private Integer quantity;
    private BigDecimal unitPrice;
}
