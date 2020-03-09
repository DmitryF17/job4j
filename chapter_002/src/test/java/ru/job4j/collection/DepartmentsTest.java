package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Test
    public void whenAsc() {
        List<String> input = List.of("k1/sk1", "k1/sk2", "k1/sk1/ssk1",
                "k1/sk1/ssk2", "k2", "k2/sk1/ssk1", "k2/sk1/ssk2");
        List<String> expect = List.of("k1", "k1/sk1", "k1/sk1/ssk1",
                "k1/sk1/ssk2", "k1/sk2", "k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk2");
        assertThat(Departments.fillGaps(input), is(expect));
    }

    @Test
    public void whenDesc() {
        List<String> input = List.of("k1/sk1", "k1/sk2", "k1/sk1/ssk1",
                "k1/sk1/ssk2", "k2", "k2/sk1/ssk1", "k2/sk1/ssk2");
        List<String> expect = List.of("k2", "k2/sk1", "k2/sk1/ssk2",
                "k2/sk1/ssk1", "k1", "k1/sk2", "k1/sk1", "k1/sk1/ssk2", "k1/sk1/ssk1");
        assertThat(Departments.sortDesc(Departments.fillGaps(input)), is(expect));
    }
}