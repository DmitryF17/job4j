package ru.job4j.loop;

public class Counter {
    public static int add(int start, int finish) {
             int sum=0;
             int s=0;
        for (int N = start; N <= finish; N++) {
            if (N % 2 == 0) {
                s = s + N;
            }
            sum=s;
        }
        return sum;
    }
}