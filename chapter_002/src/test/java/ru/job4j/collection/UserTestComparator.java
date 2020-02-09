package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserTestComparator {
    @Test
    public void whenDescNameAndAge() {
        Comparator<User> cmpNameAge = new UserDescByName().thenComparing(new UserDescByAge());
        int rsl = cmpNameAge.compare(
                new User("task", 0),
                new User("bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncNameAndAge() {
        Comparator<User> cmpNameAge = new UserIncByName().thenComparing(new UserIncByAge());
        int rsl = cmpNameAge.compare(
                new User("bug", 1),
                new User("bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncName() {
        Comparator<User> cmpName = new UserIncByName();
        int rsl = cmpName.compare(
                new User("bug", 1),
                new User("task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncAge() {
        Comparator<User> cmpAge = new UserIncByAge();
        int rsl = cmpAge.compare(
                new User("bug", 1),
                new User("bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByName() {
        Comparator<User> cmpName = new UserDescByName();
        int rsl = cmpName.compare(
                new User("task", 0),
                new User("bug", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByAge() {
        Comparator<User> cmpAge = new UserDescByAge();
        int rsl = cmpAge.compare(
                new User("bug", 4),
                new User("bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}
