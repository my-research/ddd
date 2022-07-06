package com.example.ch01jpa.domain;

public class OrderReceived {
    public OrderReceived(String address, Receiver receiver) {
        System.out.println("address = " + address);
        System.out.println("name = " + receiver.getName());
    }
}
