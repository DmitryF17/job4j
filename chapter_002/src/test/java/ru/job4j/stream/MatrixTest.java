package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixTest {

    @Test
    public void whenmatrixToList() {
        Integer[][] matrix = {
                {1, 2},
                {3, 4}
        };
        assertThat(Matrix.matrixToList(matrix), is(List.of(1, 2, 3, 4)));
    }
}
