package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 1;
        for(int x=3;x<=finish;x++){
        for(int a=2;a<x;a++){
            if(x%a==0) {
                count++;
                break;
            }
        }
        }
        return finish-count;
    }
}