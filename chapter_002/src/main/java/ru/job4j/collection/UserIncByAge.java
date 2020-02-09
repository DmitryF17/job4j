package ru.job4j.collection;

import java.util.Comparator;

public class UserIncByAge implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.getAge().compareTo(user2.getAge());
    }
}
