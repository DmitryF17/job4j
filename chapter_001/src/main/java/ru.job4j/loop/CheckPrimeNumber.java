package ru.job4j.loop;
public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = true;
        for(int a=2;a<finish;a++) {
            if (finish % a == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}