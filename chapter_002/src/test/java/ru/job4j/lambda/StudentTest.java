package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static ru.job4j.lambda.Group.sections;

public class StudentTest {
    @Test
    public void studentGroup() {
        String name1 = "Ivanov";
        String name2 = "Petrov";
        String name3 = "Sidorov";

        Set<String> unit1 = Set.of("chess", "football");
        Set<String> unit2 = Set.of("history", "basketball");
        Set<String> unit3 = Set.of("geography", "hockey");

        List<Student> students = new ArrayList<>(
                List.of(
                        new Student(name1, unit1),
                        new Student(name2, unit2),
                        new Student(name3, unit3)
                ));
        Map<String, Set<String>> sections = sections(students);
        Map<String, Set<String>> expected = new HashMap<String, Set<String>>();
        expected.put("chess", Set.of("Ivanov"));
        expected.put("football", Set.of("Ivanov"));
        expected.put("history", Set.of("Petrov"));
        expected.put("basketball", Set.of("Petrov"));
        expected.put("geography", Set.of("Sidorov"));
        expected.put("hockey", Set.of("Sidorov"));

        assertThat(sections, is(expected));

    }
}
