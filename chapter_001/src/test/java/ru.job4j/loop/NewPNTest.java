package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NewPNTest {

    @Test
    public void when5() {
        NewPN prime = new NewPN();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        NewPN prime = new NewPN();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        NewPN prime = new NewPN();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }
}