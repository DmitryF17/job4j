package ru.job4j.array;

public class Turn {
    public int[] back(int[] input) {
            for (int index = 0; index != input.length; index++) {
                int temp = input[index];
                input[index] = input[input.length-(index+1)];
                input[input.length-(index+1)] = temp;
                if(index==input.length/2-1)
                    break;
            }
            return input;
        }



}