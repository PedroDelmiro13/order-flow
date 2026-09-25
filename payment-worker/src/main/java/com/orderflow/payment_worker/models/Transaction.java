package com.orderflow.payment_worker.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID orderId;
    private BigDecimal amount;
    public enum Status {
        APPROVED, REJECTED
    }
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime processedAt;
}
