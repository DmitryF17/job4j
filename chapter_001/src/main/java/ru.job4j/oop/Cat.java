package ru.job4j.oop;
public class Cat {
    private String food;
    private String name;
    public void show() {
        System.out.println("There are " + this.name + this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void givenick(String nick) {
        this.name = nick;
    }
    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.givenick("gav's ");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.givenick("black's ");
        black.show();
    }
}