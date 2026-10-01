package com.felipysantsss.javastudy.introducao.projects.ordersProject.entities;

import java.math.BigDecimal;

public class OrderItem {
    private Integer quantity;
    private BigDecimal price;
    private Product product;

    public OrderItem(Integer quantity, BigDecimal price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal subTotal(){
        return price.multiply(new BigDecimal(quantity));
    }

    @Override
    public String toString() {
        return product + " - Quantity: " + quantity + " - " + "Total: " + subTotal() + "$";
    }
}
