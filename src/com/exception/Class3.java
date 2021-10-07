package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x;

        try {
            x = in.nextInt();
            System.out.println("You entered: "+x);
        }catch (InputMismatchException e){
            System.out.println("Please enter an integer.");
        }finally {
            System.out.println("Thank you!");
        }
    }
}
