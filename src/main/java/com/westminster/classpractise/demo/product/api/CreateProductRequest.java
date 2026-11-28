package com.westminster.classpractise.demo.product.api;

public record CreateProductRequest(
    String name,
    int qty,
    boolean inStock,
    double unitPrice

) {
    }
