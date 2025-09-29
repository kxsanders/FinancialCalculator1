package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get inputs
        System.out.println("Monthly payout: ");
        double monthlyPayout = scanner.nextDouble();

        System.out.println("Annual interest rate: (ex: type 2.50 for 2.5% interest tate, etc...");
        double rate = scanner.nextDouble() / 100;

        System.out.println("Number of years: ");
        int years = scanner.nextInt();

        // PVOA = PMT × (1 - (1 + r)^(-n)) / r
        // PVOA - Present value of the Ordinary Annuity
        // PMT - amount of each periodic payment
        // r - interest rate per period (discount)
        // n - total number of periods (payments)

        double monthlyRate = rate / 12.0;
        int months = years * 12;

        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyRate, -months)) / monthlyRate;

        //print output

        System.out.printf("Present value: $%.2f.", presentValue);








    }
}
