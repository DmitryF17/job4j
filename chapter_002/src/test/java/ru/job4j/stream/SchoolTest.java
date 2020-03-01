package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchoolTest {

    List<Student> students = Stream.of(
            new Student(20, "Ivanov"),
            new Student(60, "Petrov"),
            new Student(80, "Orlov"),
            new Student(30, "Sidorov"),
            new Student(65, "Fedorov"),
            new Student(90, "Popov")).collect(Collectors.toList());

    @Test
    public void whenStudentA() {
        List<Student> actual = new School().collect(students, student -> student.getScore() < 100 && student.getScore() > 70);
        List<Student> rsl = List.of(new Student(80, "Orlov"), new Student(90, "Popov"));
        assertThat(actual.toString(), is(rsl.toString()));
    }

    @Test
    public void whenStudentB() {
        List<Student> actual = new School().collect(students, student -> student.getScore() < 70 && student.getScore() > 50);
        List<Student> rsl = List.of(new Student(60, "Petrov"), new Student(65, "Fedorov"));
        assertThat(actual.toString(), is(rsl.toString()));
    }

    @Test
    public void whenStudentC() {
        List<Student> actual = new School().collect(students, student -> student.getScore() < 50 && student.getScore() > 0);
        List<Student> rsl = List.of(new Student(20, "Ivanov"), new Student(30, "Sidorov"));
        assertThat(actual.toString(), is(rsl.toString()));
    }
}
