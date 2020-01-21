package ru.job4j.ex;


public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User us : users) {
            if (us.getUsername().equals(login)) {
                user = us;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("login not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        if (user.getUsername().length() < 3) {
            rsl = false;
        }
        if (!user.isValid()) {
            throw new UserInvalidException("Not valide user");
        }
        return rsl;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {new User("Petr", true)};
        User user = findUser(users, "Petr");
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException et) {
            et.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
