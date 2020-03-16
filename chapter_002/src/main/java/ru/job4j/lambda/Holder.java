package ru.job4j.lambda;

import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Holder {
    String key, value;

    Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

