package cie1;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        // Input annual interest rate (percentage)
        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble();

        // Input time in years
        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
        System.out.println("i am in main branch");
    }
}