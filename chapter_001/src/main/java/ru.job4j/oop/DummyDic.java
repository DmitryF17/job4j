package ru.job4j.oop;
public class DummyDic {
    public String engtorus() {
        String trans = "lose";
       return trans;
    }
    public static void main(String[] args) {
       DummyDic word = new DummyDic();
       String eng = word.engtorus();
       System.out.println("Неизвестное слово " + eng);
    }
}
