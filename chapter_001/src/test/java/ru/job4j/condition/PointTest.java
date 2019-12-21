package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 public class PointTest{
     @Test
     public void dist2d() {
         Point a = new Point(0, 0);
         Point b = new Point(0, 4);
         double result = a.distance(b);
         assertThat(result, is(4));
     }
      @Test
      public void dist3d() {
          Point a = new Point(0, 0, 0);
          Point b = new Point(0, 2, 0);
          double result = a.distance3d(b);
          assertThat(result, is(2));
      }
 }