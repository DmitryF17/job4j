package ru.job4j.io;
import java.util.Scanner;
public class Mathes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 11;
        while (result > 0) {
            System.out.print("player take ");
            int math = Integer.valueOf(input.nextLine());
            result -= math;
            System.out.println("on the table " + result);
        }
        System.out.print("Game Over");
    }
}
