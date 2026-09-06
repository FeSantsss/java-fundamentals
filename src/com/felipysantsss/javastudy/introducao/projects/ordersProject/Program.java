package com.felipysantsss.javastudy.introducao.projects.ordersProject;

import com.felipysantsss.javastudy.introducao.projects.ordersProject.entities.Client;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.entities.Order;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.entities.OrderItem;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.entities.Product;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.entities.enums.OrderStatus;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.services.BirthFormatter;
import com.felipysantsss.javastudy.introducao.projects.ordersProject.services.MoneyConverter;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Hi, there!");
        System.out.println();

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String clientName = input.nextLine();

        System.out.print("Email: ");
        String clientEmail = input.nextLine();

        System.out.print("Birth date (dd/MM/yyyy): ");
        String birthDateString = input.nextLine();

        Client client = new Client(clientName, clientEmail, BirthFormatter.formatter(birthDateString));

        System.out.println("Enter order data:");
        System.out.println("Status List: ");
        System.out.println("(1) - PENDING PAYMENT");
        System.out.println("(2) - PROCESSING");
        System.out.println("(3) - SHIPPED");
        System.out.println("(4) - DELIVERED");
        System.out.println();
        System.out.print("Order Status: ");

        int statusChoicedNumber = input.nextInt();
        if (statusChoicedNumber <= 0 || statusChoicedNumber > 4){
            throw new IllegalArgumentException("Enter a valid value!");
        }

        OrderStatus orderStatus = switch (statusChoicedNumber) {
            case 1 -> OrderStatus.PENDING_PAYMENT;
            case 2 -> OrderStatus.PROCESSING;
            case 3 -> OrderStatus.SHIPPED;
            case 4 -> OrderStatus.DELIVERED;
            default -> throw new IllegalStateException("Unexpected value");
        };

        Order order = new Order(LocalDateTime.now(), orderStatus, client);
        System.out.println();

        System.out.print("How many items to this order? ");
        int itemsToOrder = input.nextInt();
        if (itemsToOrder <= 0){
            throw new IllegalArgumentException("Enter a positive value!");
        }

        for (int i=0;i<itemsToOrder;i++){
            try {
                System.out.println("Enter #" + i + " item data:");
                input.nextLine();
                System.out.print("Product name: ");
                String productName = input.nextLine();

                System.out.print("Product price: ");
                String productPrice = input.nextLine();

                System.out.print("Product quantity: ");
                int productQuant = input.nextInt();

                if (productQuant <= 0) {
                    throw new IllegalArgumentException("Enter a positive value!");
                }

                System.out.println();
                Product product = new Product(productName, MoneyConverter.converter(productPrice));
                OrderItem orderItem = new OrderItem(productQuant, product.getPrice(), product);

                order.addItem(orderItem);
            } catch (IllegalArgumentException e){
                throw new IllegalArgumentException("Enter valid value!");
            }
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        System.out.println("Client: " + order.getClient());
        System.out.println("Order items: ");
        for (OrderItem item : order.getItems()) {
            System.out.println(item);
        }
        System.out.println("Total: " + order.total());

        input.close();
    }
}
