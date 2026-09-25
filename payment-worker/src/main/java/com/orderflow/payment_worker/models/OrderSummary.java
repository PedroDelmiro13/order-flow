package com.orderflow.payment_worker.models;

import com.orderflow.payment_worker.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class OrderSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderId;
    private UUID customerId;
    private Enum<OrderStatus> status;
    private BigDecimal totalAmount;
    private LocalDateTime lastUpdatedAt;
}
