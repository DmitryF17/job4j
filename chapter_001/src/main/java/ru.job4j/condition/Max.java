package ru.job4j.condition;
public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
    public static int max3(int first, int second, int third) {
        int temp = max(first, second);
        int result = temp > third ? temp : third;
     return result;
    }
    public static int max4(int first, int second, int third, int fourth) {
        int temp = max(first, second);
        int tempsecond = max(third, fourth);
        int result = temp > tempsecond ? temp : tempsecond;
        return result;
    }
}
