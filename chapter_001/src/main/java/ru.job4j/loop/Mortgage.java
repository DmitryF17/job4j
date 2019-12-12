package ru.job4j.loop;
public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 1;
        double a = amount + amount / 100 * percent;
        while (a > salary) {
            a = a / 100 * percent + a - salary;
            year++;
        }
        return year;
    }
}