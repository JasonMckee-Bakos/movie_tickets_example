package org.example;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);

        int age;
        double price;
        boolean hasToy = false;

        System.out.println("Please enter your current age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        if (age <= 10) {
            price = 5;
            if (age < 5) {
                hasToy = true;
            }
        } else if (age > 65) {
            price = 8;
        } else {
            price = 12.50;
        }

        System.out.println("You owe " + fmt.format(price) + " at checkout!");

        if (hasToy) {
            System.out.println("Here is a fancy new toy!");
        }
    }
}