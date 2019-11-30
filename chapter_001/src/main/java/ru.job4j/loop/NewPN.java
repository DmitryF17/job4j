package ru.job4j.loop;

public class NewPN<count> {

    public int calc(int finish) {

        CheckPrimeNumber prime= new CheckPrimeNumber();

        int count = 1;
        for(int x=3;x<=finish;x++){
            boolean a=prime.check(x);
          if(a==true) count++;
            }
        return count;
    }
}