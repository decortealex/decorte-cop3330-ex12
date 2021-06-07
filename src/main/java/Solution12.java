/*
 * UCF COP3330 Summer 2021 Assignment 12 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args){
        double principal, rate, end;
        int years;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = Double.parseDouble(in.nextLine());
        System.out.print("Enter the rate of interest: ");
        rate = Double.parseDouble(in.nextLine());
        rate /= 100;
        System.out.print("Enter the number of years: ");
        years = Integer.parseInt(in.nextLine());

        end = principal * (1 + rate * years);

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f", years, rate * 100, end);

    }
}
