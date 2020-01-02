package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        int run = 0;
        while (run != 1) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("Show all items ");
                Item[] item = tracker.findAll();
                for (int i = 0; i < item.length; i++) {
                    System.out.println(item[i]);
                }
            } else if (select == 2) {
                System.out.println("Replace item");
                System.out.println("Exit id ");
                String id = scanner.nextLine();
                System.out.println("Exit name");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item was replaced");
                } else {
                    System.out.println("Item was not detected");
                }
            } else if (select == 3) {
                System.out.println(" Delete item ");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item was detected");
                } else {
                    System.out.println("Item was not detected");
                }
            } else if (select == 4) {
                System.out.println("Find item by id");
                System.out.print("Enter id");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println(item);
            } else if (select == 5) {
                System.out.println("Find items by name");
                System.out.print("Enter name");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                for (int i = 0; i < item.length; i++) {
                    System.out.println(item[i]);
                }
            } else if (select == 6) {
                System.out.println("Exit Program ");
                run = 1;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu. ");
        System.out.println("0. Add new Item ");
        System.out.println("1. Show all items ");
        System.out.println("2. Edit item ");
        System.out.println("3. Delete item ");
        System.out.println("4. Find item by Id ");
        System.out.println("5. Find items by name ");
        System.out.println("6. Exit Program ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}
