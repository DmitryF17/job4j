package ru.job4j.ex;


public class UserStore {

    public static boolean validate(User user) throws UserInvalidException {

        if (us == null || user.length() < 3) {
            throw  new UserInvalidException("name not validate");
        }
        return false;
    }

    public static User findUser(User[] users, String login) throws UserNotFoundException {

        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("login not found");
        }
        return null;
    }




    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
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
