package ru.job4j.something;
public class Animal {
    private String name;
    public Animal() {
    }
    public Animal(String leo) {
        super();
        this.name = leo;
        System.out.println("load Animal");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
