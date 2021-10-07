package com.interfaces;

public class Invoice implements Payable{
    private String itemName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String itemName, int quantity, double pricePerItem) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public double getPaymentAmount() {
        return (quantity*pricePerItem);
    }
}
