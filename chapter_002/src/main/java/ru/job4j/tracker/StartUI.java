package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StartUI {

    private static Consumer<String> output;

    public void init(Input input, Store store, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions, output);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, store, output);
        }
    }

    private void showMenu(UserAction[] actions, Consumer<String> output) {
        output.accept("Menu.");
        int index = 0;
        for (UserAction user : actions) {
            output.accept(index++ + ". " + user.name());
        }
    }

    public static void main(String[] args) {
        Input validate = new ValidateInput(
                new ConsoleInput()
        );
        try (Store tracker = new SqlTracker()) {
            tracker.init();
           UserAction[] actions = {
                    new CreateAction()
            };
            new StartUI().init(validate, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

