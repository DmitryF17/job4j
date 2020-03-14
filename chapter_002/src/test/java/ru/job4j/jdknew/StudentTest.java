package ru.job4j.jdknew;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.jdknew.Student.levelOf;

public class StudentTest {
    @Test
    public void levelMoreThan3() {
        List<Student> students = Arrays.asList(
                (new Student("Ivanov", 1)),
                null,
                (new Student("Petrov", 5)),
                (new Student("Sidorov", 2))
        );
        List<Student> rsl = levelOf(students, 3);
        Student exp = new Student("Petrov", 5);
        assertThat(rsl.get(0), is(exp));
    }
}
