package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int res = 1;
        for (int a = 1; a <= n; a++) {
            res = res * a;
        }
        return res;
    }
}