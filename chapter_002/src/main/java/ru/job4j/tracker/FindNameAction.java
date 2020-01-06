package ru.job4j.tracker;

public class FindNameAction implements UserAction {

    @Override
    public String name() {
        return "Find Items by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
        return true;
    }
}