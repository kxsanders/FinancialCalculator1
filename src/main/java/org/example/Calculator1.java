package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator1 {
    public static void main(String[] args) {

        //
        // utilize a scanner for user input
        // PEMDAS and Math.pow
        // Apply formula
        // Total interest
        // Output

        //get user input

        System.out.println("What is the principal loan amount?");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        System.out.println("What is the interest rate?");
        double interestRate = scanner.nextDouble();

        System.out.println("What is the loan length in years?");
        int years = scanner.nextInt();

        // convert into usable values based on formula info

        double annualInterestRate = interestRate / 100.0;
        double monthlyInterestRate = annualInterestRate / 12.0;
        int monthlyPayments = years * 12;

        // Now it's time to apply the formula.
        // So, let's break it down.

        // This is the first half before the /
        double onePlusMonthlyRate = 1 + monthlyInterestRate;
        double power = Math.pow(onePlusMonthlyRate, monthlyPayments);

        double numerator = monthlyInterestRate * power;
        double denominator = power - 1;

        //Combine it

        double split = numerator / denominator;
        double monthlyPayment = principal * split;

        // Total interest

        double totalInterest = (monthlyPayment * monthlyPayments) - principal;

        //Output
        System.out.printf("Monthly payment: $%.2f. ", monthlyPayment);
        System.out.printf("Total interest paid: $%.2f", totalInterest);

    }
}