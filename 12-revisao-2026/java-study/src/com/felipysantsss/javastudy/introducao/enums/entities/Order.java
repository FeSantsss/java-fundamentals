package com.felipysantsss.javastudy.introducao.enums.entities;

import com.felipysantsss.javastudy.introducao.enums.entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer ID;
    private Date moment;
    private OrderStatus status;

    public Order(Integer ID, Date moment, OrderStatus status) {
        this.ID = ID;
        this.moment = moment;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getID() + " - " + getMoment() + " (" + getStatus() + ")";
    }
}
