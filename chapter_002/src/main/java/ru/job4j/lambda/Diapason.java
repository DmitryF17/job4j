package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Diapason {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> diapFunc = new ArrayList();
        for (int ind = start; ind != end; ind++) {
            diapFunc.add(func.apply((double) ind));
        }
        return diapFunc;
    }
}