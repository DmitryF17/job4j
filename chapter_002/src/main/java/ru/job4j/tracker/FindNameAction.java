package ru.job4j.tracker;

import java.util.List;

public class FindNameAction implements UserAction {

    @Override
    public String name() {
        return "Find Items by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> item = tracker.findByName(name);
        for (int i = 0; i < item.size(); i++) {
            System.out.println(String.format("%s %s",
                    item.get(i).getId(),
                    item.get(i).getName()));
        }
        return true;
    }
}