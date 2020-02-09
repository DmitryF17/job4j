package ru.job4j.collection;

import java.util.Comparator;

public class UserDescByName implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user2.getName().compareTo(user1.getName());
    }
}