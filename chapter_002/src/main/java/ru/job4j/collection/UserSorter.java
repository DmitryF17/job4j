package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserSorter {
    public static void main(String[] args) {
        List<User> user = Arrays.asList(
                new User("bug", 1),
                new User("bug", 4),
                new User("bug", 2),
                new User("task", 0)
        );
        System.out.println(user);
        Collections.sort(user, new UserDescByName().thenComparing(new UserDescByAge()));
        System.out.println(user);
        Collections.sort(user, new UserIncByName().thenComparing(new UserIncByAge()));
        System.out.println(user);
    }
}
