package com.orderflow.inventory_worker.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;import java.util.EnumSet;import java.util.UUID;

@Entity
public class InventoryReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID orderId;
    public enum Status {
        APPROVED, REJECTED
    }
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime processedAt;

}
