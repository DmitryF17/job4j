package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el, int s) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index=0;index!=s;index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}