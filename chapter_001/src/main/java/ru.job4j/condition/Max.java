package ru.job4j.condition;
public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        return max(third, max(first, second));
    }
    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }
}
