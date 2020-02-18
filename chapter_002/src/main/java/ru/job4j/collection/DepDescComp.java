package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            int rsl = Character.compare(right.charAt(i), left.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        if (left.length() != right.length()) {
            return left.length() - right.length();
        }
        return 0;
    }
}
