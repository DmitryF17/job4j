package ru.job4j.ex;

public class FindEI {

    public static int indexof(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
                break;
            }
        }

        if (rsl == -1) {
            throw new ElementNotFoundException("key do not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] elements = {"1", "2", "3"};
        try {
            indexof(elements, "0");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

