package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> nameskey = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                nameskey.add(item);
            }
        }
        return nameskey;
    }

    public Item findById(String id) {
        int i = indexOf(id);
        if (i != -1) {
            return items.get(i);
        }
        return null;
    }

    public boolean replace(String id, Item item) {
        boolean res = false;
        int pos = indexOf(id);
        if (pos != -1) {
            res = true;
            item.setId(items.get(pos).getId());
            items.set(pos, item);
            item.getName();
        }
        return res;
    }

    public boolean delete(String id) {
        boolean res = false;
        int pos = indexOf(id);
        if (pos != -1) {
            res = true;
            items.remove(pos);
            System.arraycopy(items, pos + 1, items, pos, position - pos);
            position--;
        }
        return res;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}

			


