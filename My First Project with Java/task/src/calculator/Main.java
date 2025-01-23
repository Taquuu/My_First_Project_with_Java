package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prices:\nBubblegum: $2\nToffee: $0.2\nIce cream: $5\nMilk chocolate: $4\nDoughnut: $2.5\nPancake: $3.2\n");
        System.out.println("Earned Amount:\nBubblegum: $202\nToffee: $118\nIce cream: $2250\nMilk chocolate: $1680\nDoughnut: $1075\nPancake: $80\nIncome: $5405");

        int income = 5405;

        System.out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();

        int netIncome = income - staffExpenses - otherExpenses;
        System.out.println("Net income: $" + netIncome);
    }
}