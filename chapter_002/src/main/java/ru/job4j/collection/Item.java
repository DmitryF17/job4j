package ru.job4j.collection;

public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "id='" + id + '\''
                + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Item another) {
        return name.compareTo(another.name);
    }
}
