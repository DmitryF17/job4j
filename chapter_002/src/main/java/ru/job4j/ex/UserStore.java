package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        User us = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                us = users[i];
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("login not found");
        }
        return us;
    }

    public static boolean validate(User user) throws UserInvalidException {

        if (user.getUsername() == "Petr") {
            return true;
        }
        System.out.println("login do not validate");
        return false;
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
        User[] users = {
                new User("Petr", true)
        };
        try {
            findUser(users, "Petr");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        User user = findUser(users, "Petr");
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}