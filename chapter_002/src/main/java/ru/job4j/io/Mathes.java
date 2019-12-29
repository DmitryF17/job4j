package ru.job4j.io;

import java.util.Scanner;

public class Mathes {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player = 0;
        int result = 11;
        while (result > 0) {
            System.out.print("player take ");
            int math = Integer.valueOf(input.nextLine());
            result -= math;
            player++;
            System.out.println("on the table " + result);
        }
        if (player % 2 == 0) {
            System.out.println("Win the second player");
        } else {
            System.out.println("Win the first player");
        }
    }
}
