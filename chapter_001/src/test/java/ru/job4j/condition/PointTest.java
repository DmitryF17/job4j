package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
 public class PointTest {
     @Test
     public void dist2d() {
         Point a = new Point(0, 0);
         Point b = new Point(0, 4);
         double expected = 4;
         double out = a.distance(b);
         assertEquals(expected, out, 0.01);
     }
      @Test
      public void dist3d() {
          Point a = new Point(0, 0, 0);
          Point b = new Point(0, 2, 0);
          double expected = 2;
          double out = a.distance3d(b);
          assertEquals(expected, out, 0.01);
      }
 }