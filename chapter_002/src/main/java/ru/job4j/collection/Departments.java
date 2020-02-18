package ru.job4j.collection;

import java.util.*;

public class Departments {


    public static List<String> fillGaps(List<String> deps) {
        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    tmp.add(el);
                    start = el;
                } else {
                    tmp.add(start + "/" + el);
                    start = start + "/" + el;
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static List<String> sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }
}