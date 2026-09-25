package com.orderflow.payment_worker.enums;

public enum OrderStatus {
    PENDING, INVENTORY_APPROVED, INVENTORY_REJECTED, PAYMENT_APPROVED,
    PAYMENT_REJECTED, COMPLETED, CANCELLED;
}
