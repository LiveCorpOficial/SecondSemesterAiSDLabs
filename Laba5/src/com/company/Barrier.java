package com.company;

import java.util.Arrays;
import java.util.Random;

public class Barrier {
    public static void main(String[] args) {
        Random rand = new Random();

        int point = 0;
        int[] arr = new int[100];
        int count;
        int elementToSearch = 12;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rand.nextInt(100);
            }

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            long start = System.nanoTime();
            if(arr[arr.length-1] != elementToSearch) {
                arr[arr.length - 1] = elementToSearch;
                for(count = 0; count < arr.length; count++){
                    point++;
                    if (arr[count] == elementToSearch){
                        break;
                    }
                }
                if (count == arr.length){
                    //System.out.println("Элемент не найден!");
                }
            }
            long finish = System.nanoTime();

            System.out.println("Прошло времени, нс: " + (finish-start));
            System.out.println("Колличество сравнений: " + point);
        }
    }
}
