package ru.job4j.tracker;
public class Predator extends Animal {
    private String name;
    public Predator() {
    }
    public Predator(String leo) {
        super();
        this.name = leo;
        System.out.println("load Predator");
    }
    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
