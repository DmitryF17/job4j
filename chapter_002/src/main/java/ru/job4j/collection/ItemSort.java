package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSort {
    public static void main(String[] args) {
        List<Item> item = Arrays.asList(
                new Item("second"),
                new Item("first"),
                new Item("third")
        );
        System.out.println(item);
        Collections.sort(item, new SortItem());
        System.out.println(item);
        Collections.sort(item, new SortReverseItem());
        System.out.println(item);
    }
}