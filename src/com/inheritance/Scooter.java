package com.inheritance;

public class Scooter extends Motorcycle{
    private int wheels;

    public Scooter(String name, float price, int wheels) {
        super(name, price);
        this.wheels = wheels;
    }

    @Override
    public void showDetails(){
        System.out.println("This is another method");
        System.out.println("Wheels: "+ wheels);
    }
}
