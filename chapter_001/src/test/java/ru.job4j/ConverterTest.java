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
    public void EuroToruble() {
        int in = 3;
        int expected = 210;
        int out = Converter.EuroToruble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void DollarToruble(){
        int in = 4;
        int expected = 240;
        int out = Converter.DollarToruble(in);
        Assert.assertEquals(expected,out);
}
}
