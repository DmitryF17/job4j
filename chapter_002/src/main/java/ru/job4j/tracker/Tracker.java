package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {

        return Arrays.copyOf(this.items, this.position);
    }

    public Item[] findByName(String key) {
        Item[] nameskey = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = this.items[index];
            if (item.getName().equals(key)) {
                nameskey[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(nameskey, size);
    }

    public Item findById(String id) {
        int i = indexOf(id);
        if (i != -1) {
            return items[i];
        }
        return null;
    }

    public boolean replace(String id, Item item) {
        boolean res = false;
        int pos = indexOf(id);
        if (pos != -1) {
            res = true;
<<<<<<< HEAD
            item.setId(items[pos].getId());
            items[pos] = item;
=======
            items[pos] = item;
            item.getName();
>>>>>>> 2b7fd7b...  2.1. Реализация класса StartUI [#199697]
        }
        return res;
    }

    public boolean delete(String id) {
        boolean res = false;
        int pos = indexOf(id);
        if (pos != -1) {
            res = true;
            items[pos] = null;
            System.arraycopy(items, pos + 1, items, pos, position - pos);
            position--;
        }
        return res;
    }
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}

			


