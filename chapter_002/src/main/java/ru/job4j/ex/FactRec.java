package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {

        if (n == 1) {
            return n;
        }
        return calc(n - 1) * n;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}