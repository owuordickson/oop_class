package com.classes;

public class Main {

    public static void main(String[] args){
        Account acc1 = new Account("ACC-00-001", 500);
        acc1.showDetails();

        Account acc2 = new Account("ACC-00-002", 1500);
        acc2.showDetails();
    }

}
