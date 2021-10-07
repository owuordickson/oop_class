package com.interfaces;

public class Employee implements Payable{
    private String fname;
    private String lname;
    private double salary;

    public Employee(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
