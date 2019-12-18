package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1greatThen2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2greatThen1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1eq2Then2() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
    @Test
    public void MaxForThree() {
        int result = Max.max3(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void MaxForFour() {
        int result = Max.max4(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
