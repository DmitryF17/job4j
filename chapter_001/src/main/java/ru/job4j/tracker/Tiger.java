package ru.job4j.tracker;
public class Tiger extends Predator {
    private String name;
    public Tiger() {
    }
    public Tiger(String leo) {
        super();
        this.name = leo;
        System.out.println("load Tiger");
    }
    public static void main(String[] args) {
       Tiger tiger = new Tiger();
    }
}
