package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        //I found out that if you use /100, it converts a percentage into a decimal. I wonder if that's acceptable.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the deposit amount?");
        double deposit = scanner.nextDouble();

        System.out.println("What is the interest rate? (ex: type 1.75 for 1.75%, ect..");
        double interestRate = scanner.nextDouble() / 100;

        System.out.println("What are the number of years?");
        int matureYear = scanner.nextInt();

        // pull 365 from formula
        int daysPerYear = 365;
        int totalNumberOfDays = matureYear * 365;

        // annual interest rate/365
        double dailyRate = interestRate / daysPerYear;

        // Future value formula
        double futureValue = deposit * Math.pow(1 + dailyRate, totalNumberOfDays);

        // total interest earned formula
        double interestEarned = futureValue - deposit;

        //print result

        System.out.printf("Future value after %d years: $%.2f.", matureYear, futureValue);
        System.out.printf("Total Interest earned: $%.2f.", interestEarned);





    }
}
