package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;
public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void eurotoruble() {
        int in = 3;
        int expected = 210;
        int out = Converter.eurotoruble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void dollartoruble() {
        int in = 4;
        int expected = 240;
        int out = Converter.dollartoruble(in);
        Assert.assertEquals(expected, out);
}
}
