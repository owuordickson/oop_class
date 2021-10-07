package com.inheritance;

public class Motorcycle {
    private String name;
    private float price;

    public Motorcycle(String name) {
        this.name = name;
    }

    public Motorcycle(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
