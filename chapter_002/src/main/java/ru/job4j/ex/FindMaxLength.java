package ru.job4j.ex;

import java.util.Arrays;

public class FindMaxLength {

    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            if (shops[index] != null) {
                max++;
            }
        }
        System.out.println("Max length : " + max);
    }
}