package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String txt : text) {
            check.add(txt);
        }
        for (String org : origin) {
            if (!check.contains(org)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
