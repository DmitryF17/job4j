package ru.job4j.ex;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n to calculate the factorial ");
        int n = Integer.valueOf(input.nextLine());
        System.out.println("factorial " + n + calc(n));
    }

    public static int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n cannot be less than 1");
        }
        int rsl = 1;
        for (int index = 1; index != 3; index++) {
            rsl += index;
        }
        return rsl;
    }

}