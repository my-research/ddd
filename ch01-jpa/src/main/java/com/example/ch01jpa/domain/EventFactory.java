package com.example.ch01jpa.domain;

public class EventFactory {
    public static OrderReceived orderReceived(Order order) {
        String address = order.getAddress();
        Receiver receiver = order.getReceiver();
        return new OrderReceived(address, receiver);
    }

    public OrderReceived orderReceivedNonStatic(Order order) {
        String address = order.getAddress();
        Receiver receiver = order.getReceiver();
        return new OrderReceived(address, receiver);
    }
}
