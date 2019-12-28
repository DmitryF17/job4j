package ru.job4j;
public class Surgeon extends Doctor {
    private String operation;
    private  Surgeon() {
        super();
    }
    public String getOperation() {
        return operation;
    }
}
