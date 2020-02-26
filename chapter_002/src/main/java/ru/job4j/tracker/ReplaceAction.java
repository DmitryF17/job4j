package ru.job4j.tracker;

import java.util.function.Consumer;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Replace Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter Name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            output.accept("Item was replaced");
        } else {
            output.accept("Item was not detected");
        }
        return true;
    }
}