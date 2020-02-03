package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivan@yandex", "Ivan Ivanovich Ivanov");
        map.put("Oleg@mail", "Oleg Olegovich Olegov");
        map.put("Fedor@gmail", "Fedor Fedorovich Fedorov");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}