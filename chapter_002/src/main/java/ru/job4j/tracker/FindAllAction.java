package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show All Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (int i = 0; i < item.length; i++) {
            System.out.println(String.format("%s %s",
                    item[i].getId(),
                    item[i].getName()));
        }
        return true;
    }
}