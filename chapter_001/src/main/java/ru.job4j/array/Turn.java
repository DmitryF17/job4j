package ru.job4j.array;
public class Turn {
    public int[] back(int[] input) {
            for (int index = 0; index < input.length / 2; index++) {
                int temp = input[index];
                input[index] = input[input.length - (index + 1)];
                input[input.length - (index + 1)] = temp;
            }
            return input;
        }
}