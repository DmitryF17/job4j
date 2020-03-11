package ru.job4j.jdknew;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

import static ru.job4j.jdknew.Student.levelOf;

public class StudentTest {
    @Test
    public void levelMoreThan3() {
      List<Student> students = List.of(
              (new Student("Ivanov", 5)),
              (new Student("Petrov", 2)),
              (new Student("Fedorov", 1))
      );
      var res = new Student("Ivanov", 5);
      List<Student> rsl = levelOf(students, 3);
      assertEquals(rsl, List.of(res));
    }
}
