
package ru.job4j.condition;

        import org.junit.Test;
        import static org.hamcrest.Matchers.is;
        import static org.junit.Assert.assertThat;

public class SqMaxTest {


    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 2, 4, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(3, 2, 1, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenEqNum() {
        SqMax check = new SqMax();
        int result = check.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}