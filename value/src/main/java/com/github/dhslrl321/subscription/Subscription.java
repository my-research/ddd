package com.github.dhslrl321.subscription;

/**
 * 책임 분산
 */
public class Subscription {
    private ReservedBill bill;

    public void reserveNextBill() {
        this.bill = bill.reserve();
    }
}
