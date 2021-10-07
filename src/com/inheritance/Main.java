package com.inheritance;

public class Main {

    public static void main(String[] args){
        Motorcycle cycle1 = new Motorcycle("Honda", 6740);
        cycle1.showDetails();

        Scooter cycle2 = new Scooter("Suzuki", 2350, 3);
        cycle2.showDetails();
        //cycle2.showAttributes();
    }

}
