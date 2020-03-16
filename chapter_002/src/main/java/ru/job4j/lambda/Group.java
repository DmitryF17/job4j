package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    public static int sections(List<Student> students) {
        return students.stream().flatMap(student ->
                student.getUnits().stream()
                        .map(group -> new Holder(group, student.getName()))
        ).collect(Collectors.groupingBy(t -> t.key,
                        Collector.of(HashSet::new,
                                (set, el) -> {
                            set.add(el.value);
                                },
                                        (left, right) -> {
                            left.addAll(right); return left;
                        }
                        )
                )
        );
    }
}
