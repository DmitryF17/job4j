package ru.job4j.calculator;

/**
*Package for calculator task.
*@author Dmitry Faroynts (farodmin@yandex.ru)
*@version $id$
*@since 0.1
*/
public class  Calculator {

    /**
     * Metod add.
     * @param first
     * @param second
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    /**
     * Metod div.
     * @param first
     * @param second
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    /**
     * Metod multiply.
     * @param first
     * @param second
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Metod subtrack.
     * @param first
     * @param second
     */
    public static void subtrack(double first, double second) {
        double result = second - first;
        System.out.println(second + "-" + first + "=" + result);
    }


    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(5, 10);

    }
}
