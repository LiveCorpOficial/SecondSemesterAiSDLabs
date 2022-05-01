package com.company;

import java.util.Arrays;
import java.util.Random;

public class Line {
    public static void main(String[] args) {
        Random rand = new Random();

        int point = 0;
        int[] arr = new int[10000];
        int count;
        int elementToSearch = 12;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rand.nextInt(100);
            }

            System.out.println(Arrays.toString(arr));

            long start = System.nanoTime();
            for (count = 0; count < arr.length; count++) {
                point++;
                if (arr[count] == elementToSearch){
                    break;
                }
            }
            if (count == arr.length){
                //System.out.println("Element " + elementToSearch + " not found");
            }
            long finish = System.nanoTime();

            System.out.println("Прошло времени, нс: " + (finish-start));
            System.out.println("Колличество сравнений: " + point);
        }
    }
}
