package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(@NotNull User o) {
        int rst = name.compareTo(o.name);
        if (rst == 0) {
            return age.compareTo(o.age);
        }
        return rst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User name '" + name
                + "', age " + age;
    }
}
