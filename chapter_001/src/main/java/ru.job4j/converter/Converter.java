package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int eurotoruble(int value) {
        return value * 70;
    }
    public static int dollartoruble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
     System.out.println("140 rubles are 2 . Test result " + passed);
    int in1 = 120;
    int expected1 = 2;
    int out1 = rubleToDollar(in1);
    boolean passed1 = expected1 == out1;
     System.out.println("120 rubles are 2 . Test result " + passed1);
     int in2 = 2;
     int expected2 = 140;
     int out2 = eurotoruble(in2);
     boolean passed2 = expected2 == out2;
     System.out.println("2 euro are 140 . Test result " + passed2);
     int in3 = 2;
     int expected3 = 120;
     int out3 = dollartoruble(in3);
     boolean passed3 = expected3 == out3;
     System.out.println("2 dollar are 120 . Test result " + passed3);
    }
}
