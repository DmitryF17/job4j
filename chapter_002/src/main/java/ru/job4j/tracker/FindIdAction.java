package ru.job4j.tracker;

public class FindIdAction implements UserAction {

    @Override
    public String name() {
        return "Find Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Find Item by ID " + item);
        } else {
            System.out.println("Item was not found");
        }
        return true;
    }
}