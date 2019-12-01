package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(data, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas7Then0() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3, 7, 15};
        int value = 7;
        int result = find.indexOf(data, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas17Then0() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3, 4, 8, 17, 9};
        int value = 17;
        int result = find.indexOf(data, value);
        int expect = 5;
        assertThat(result, is(expect));
    }
}