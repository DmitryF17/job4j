package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        int run = 0;
        while (run != 1) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
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
                String id = input.askStr("Exit id: ");
                String name = input.askStr("Exit name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item was replaced");
                } else {
                    System.out.println("Item was not detected");
                }
            } else if (select == 3) {
                System.out.println(" Delete item ");
                String id = input.askStr("Enter id: ");
                if (tracker.delete(id)) {
                    System.out.println("Item was detected");
                } else {
                    System.out.println("Item was not detected");
                }
            } else if (select == 4) {
                System.out.println("Find item by id");
                String id = input.askStr("Enter id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Find item by id " + item);
                } else {
                    System.out.println("Item was not found");
                }
            } else if (select == 5) {
                System.out.println("Find items by name");
                String name = input.askStr("Enter name: ");
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
        Input input = new Consoleinput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

}
