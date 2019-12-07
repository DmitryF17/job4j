package ru.job4j.array;

/**
 * Package for Defragment
 *
 *
 * author DmitryF17
 * version 01
 * since 06.12.2019
 */
public class Defragment {
    /**
     * Metod replace null on full and shift null to the end
     * @param array [] string
     * @return array [] string
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index]; // search  null cell
            if (cell == null) {
                  int  ind = index;
               while (ind != array.length) {
                  if (array[ind] != null) { // search full cell
                      array[index] = array[ind]; // change null on full
                      array[ind] = null;
                      break; // break if get replacing
                  }
                  ind++; // go over to next cell
               }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Metod main
     * @param args [] string
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}