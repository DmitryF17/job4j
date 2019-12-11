package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int t = 0;

        while(t < right.length + left.length){
        if (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                rsl[t] = left[l];
                l++;
            } else {
                rsl[t] = right[r];
                r++;
            }
            t++;
            if (l >= left.length) {
                while (r < right.length) {
                    rsl[t] = right[r];
                    r++;
                    t++;
                }
            }
            if (r >= right.length) {
                while (l < left.length) {
                    rsl[t] = left[l];
                    l++;
                    t++;
                }
            }
        }else{
             rsl[t] = right[r];
             r++;
             t++;
            }
        }
        return rsl;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
