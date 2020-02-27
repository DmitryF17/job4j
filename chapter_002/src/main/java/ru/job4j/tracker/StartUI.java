package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StartUI {

    private static Consumer<String> output;

    public void init(Input input, Tracker tracker, List<UserAction> actions, Consumer<String> output) {
        boolean run = true;
        while (run) {
            this.showMenu(actions, output);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker, output);
        }
    }

    private void showMenu(List<UserAction> actions, Consumer<String> output) {
        output.accept("Menu.");
        int index = 0;
        for (UserAction user : actions) {
            output.accept(index++ + ". " + user.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new DeleteAction());
        actions.add(new FindAllAction());
        actions.add(new FindIdAction());
        actions.add(new FindNameAction());
        actions.add(new ReplaceAction());
        actions.add(new ExitAction());
        new StartUI().init(input, tracker, actions, output);
    }
}

