package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show All Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findAll();
        for (int i = 0; i < item.size(); i++) {
            System.out.println(String.format("%s %s",
                    item.get(i).getId(),
                    item.get(i).getName()));
        }
        return true;
    }
}