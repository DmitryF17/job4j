package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Input input, Tracker tracker) {
        System.out.println("Show all items ");
        Item[] item = tracker.findAll();
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("Replace item");
        String id = input.askStr("Exit id: ");
        String name = input.askStr("Exit name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was replaced");
        } else {
            System.out.println("Item was not detected");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println(" Delete item ");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item was detected");
        } else {
            System.out.println("Item was not detected");
        }
    }

    public static void findId(Input input, Tracker tracker) {
        System.out.println("Find item by id");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Find item by id " + item);
        } else {
            System.out.println("Item was not found");
        }
    }

    public static void findName(Input input, Tracker tracker) {
        System.out.println("Find items by name");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        this.showMenu();
        int select = Integer.valueOf(input.askStr("Select "));
        while (run) {
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findId(input, tracker);
            } else if (select == 5) {
                StartUI.findName(input, tracker);
            } else if (select == 6) {
                System.out.println("Exit Program ");
                run = false;
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
        StartUI.createItem(input, tracker);
    }

}
