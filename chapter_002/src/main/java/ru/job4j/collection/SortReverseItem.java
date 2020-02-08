package ru.job4j.collection;

import java.util.Comparator;

public class SortReverseItem implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}