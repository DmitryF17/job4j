package ru.job4j.stream;

public class Student {
    private int score;
    private String name;


    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student " + name + " score " + '\'' + score;
    }
}