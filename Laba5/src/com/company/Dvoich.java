package com.company;

import java.util.Arrays;
import java.util.Random;

public class Dvoich {
    public static void main(String[] args) {
        Random rand = new Random();

        int first = 0;
        int[] arr = new int[50];
        int last = arr.length - 1;
        int elementToSearch = 12;

        for (int j = 0; j < arr.length; j++) {
            arr[j] = rand.nextInt(100);
        }

        Arrays.sort(arr);

        int position = (first + last) / 2;
        int count = 1;

        long start = System.nanoTime();
        while (first <= last) {
            if (arr[position] < elementToSearch) {
                first = position + 1;
            } else if (arr[position] == elementToSearch) {
                break;
            } else {
                last = position - 1;
            }
            position = (first + last) / 2;
            count++;
        }
        long finish = System.nanoTime();
        long sr = finish-start;

        if (first > last) {
            System.out.println(elementToSearch + " находится на " + position + " позиции");
        }

        System.out.println("Всего сравнений: " + count);
        System.out.println("Прошло времени, нс: " + (sr));
    }
}
