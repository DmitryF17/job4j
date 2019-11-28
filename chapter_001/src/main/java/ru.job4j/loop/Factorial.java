package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int res=1;
        for(int A=1;A<=n;A++){
            res=res*A;
           result=res;
        }
        return result;
    }
}