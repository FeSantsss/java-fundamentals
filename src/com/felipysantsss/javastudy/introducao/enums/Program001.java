package com.felipysantsss.javastudy.introducao.enums;

import com.felipysantsss.javastudy.introducao.enums.entities.Order;
import com.felipysantsss.javastudy.introducao.enums.entities.enums.OrderStatus;
import com.felipysantsss.javastudy.introducao.enums.entities.enums.SubscriptionPlans;

import java.util.Date;

public class Program001 {
    public static void main(String[] args) {
        Order newOrder = new Order(01, new Date(), OrderStatus.WAITING_PAYMENT);
        System.out.println(newOrder);


    }
}
