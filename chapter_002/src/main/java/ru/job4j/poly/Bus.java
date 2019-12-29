package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("The bus is going");
    }

    @Override
    public void passangers(String number) {
        System.out.println("Passangers ");
        Scanner input = new Scanner(System.in);
        int numberpas = Integer.valueOf(input.nextLine());
        System.out.println("Passangers " + numberpas);
    }

    @Override
    public int tankup(String fuel) {
        System.out.println("Tank up fuel ");
        Scanner input = new Scanner(System.in);
        int cost = Integer.valueOf(input.nextLine()) * 10;
        System.out.println("Cost fuel ");
        return cost;
    }
}