package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int res=1;
        for(int A=1;A<=n;A++){
            res=res*A;
        }
        return res;
    }
}