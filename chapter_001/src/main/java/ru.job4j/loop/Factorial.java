package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int F=1;
        for(int A=1;A<=n;A++){
            F=F*A;
           result=F;
        }
        return result;
    }
}