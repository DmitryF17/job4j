package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void sortItemTest() {
        SortItem si = new SortItem();
        List<Item> item = Arrays.asList(
                new Item("second"),
                new Item("third"),
                new Item("first")
        );
        Collections.sort(item, new SortItem());
        List<Item> expect = Arrays.asList(
                new Item("first"),
                new Item("second"),
                new Item("third")
        );
        assertThat(si.compare(item.get(0), expect.get(0)), is(0));
        assertThat(si.compare(item.get(1), expect.get(1)), is(0));
        assertThat(si.compare(item.get(2), expect.get(2)), is(0));
    }
}
