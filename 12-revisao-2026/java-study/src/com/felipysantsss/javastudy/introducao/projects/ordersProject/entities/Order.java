package com.felipysantsss.javastudy.introducao.projects.ordersProject.entities;

import com.felipysantsss.javastudy.introducao.projects.ordersProject.entities.enums.OrderStatus;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.exceptions.DontExistOrderException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList();
    private Client client;

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem itemToAdd){
        if (itemToAdd == null){
            throw new DontExistOrderException("This order doesn't exist!");
        }
        items.add(itemToAdd);
    }

    public void removeItem(OrderItem itemToRemove){
        if (itemToRemove == null){
            throw new DontExistOrderException("This order doesn't exist!");
        }
        OrderItem orderToRemoveOnList = items
                .stream()
                .filter(item -> item.equals(itemToRemove))
                .findAny()
                .orElseThrow(() -> new DontExistOrderException("This order doesn't exist on order list!"));
        items.remove(orderToRemoveOnList);
    }

    public BigDecimal total() {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item : items) {
            total = total.add(item.subTotal());
        }
        if (total.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Total is ZERO");
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order: " + moment + " - " + total() + "$ - STATUS: " + status;
    }
}
