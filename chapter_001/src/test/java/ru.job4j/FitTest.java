package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;
public class FitTest {
    @Test
    public void manWeight(){
        double height=110;
        double expected=11.5;
        double out=Fit.manWeight(height);
        Assert.assertEquals(expected,out,0.01);
    }
    @Test
    public void womanWeight(){
        double height=120;
        double expected=11.5;
        double out=Fit.womanWeight(height);
        Assert.assertEquals(expected,out,0.01);
    }
}
