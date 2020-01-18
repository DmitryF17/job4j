package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public enum TrackerSingleEnum {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }
}
