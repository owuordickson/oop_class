package com.interfaces;

public class Main {

    public static void main(String[] args){
        Invoice inv = new Invoice("Dress", 2, 1024.5);
        Employee emp = new Employee("John", "Doe", 5350);

        System.out.println(inv.getItemName() + "costs: " + inv.getPaymentAmount());
        System.out.println(emp.getFname() + "earns: " + emp.getPaymentAmount());
    }

}
