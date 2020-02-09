package ru.job4j.collection;

import java.util.Comparator;

public class UserDescByAge implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user2.getAge().compareTo(user1.getAge());
    }
}
