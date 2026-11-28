package com.westminster.classpractise.demo.product.api;

public interface Discountable {
    void applyDiscount(double rate);
    double getDiscountedPrice();
}
