package com.company;

public class Number {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        array[1] = 1;
        array[2] = 2;
        array[3] = 5;
        for (int i = 0; i < array.length; i++ ) {
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }
    }
}

