package ru.job4j.singleton;

public enum TrackerSingleEnum {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }
}
