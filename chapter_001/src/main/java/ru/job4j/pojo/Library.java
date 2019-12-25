package ru.job4j.pojo;
public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book("Clean code", 100);
        Book coursejob4j = new Book("Course job4j", 200);
        Book betterbook = new Book("Better Book", 300);
        Book intheworld = new Book("In the world", 400);
        Book[] books = new Book[4];
        books[0] = cleancode;
        books[1] = coursejob4j;
        books[2] = betterbook;
        books[3] = intheworld;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + "-" + pr.getPages());
        }
        System.out.println("Replace Clean code to In the world");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + "-" + pr.getPages());
        }
        System.out.println(" Show book with name Clean code ");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if (pr.getName() == "Clean code") {
                System.out.println(pr.getName() + "-" + pr.getPages());
            }
        }
    }
}

