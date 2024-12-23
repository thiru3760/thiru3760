package LabSesssion.InventoryManagement;

import java.util.PriorityQueue;

public class OrderProcess {
    private PriorityQueue<Order> orders;

    public OrderProcess() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void processOrder() {
        Order order = orders.poll();
        System.out.println("Order ID: " + order.getOrderId());
    }
}
