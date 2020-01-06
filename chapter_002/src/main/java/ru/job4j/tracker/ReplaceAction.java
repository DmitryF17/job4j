package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Replace Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter Name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was replaced");
        } else {
            System.out.println("Item was not detected");
        }
        return true;
    }
}