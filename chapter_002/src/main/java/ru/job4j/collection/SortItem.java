package ru.job4j.collection;

import java.util.Comparator;

public class SortItem implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}