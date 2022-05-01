package com.company;

import java.util.Arrays;
import java.util.Random;

public class Vstavka {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[50];
        int point = 0;
        int iteritsii = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        long start = System.currentTimeMillis();
        for (int left = 0; left < arr.length; left++) {
            for (int j = 0; j < arr.length*0.75; j++) {
                int pos = j;
                int min = arr[j];
                for(int q = j + 1; q < arr.length; q++){
                    if(arr[q] < min){
                        pos = q;
                        min = arr[q];
                    }
                }
                arr[pos] =arr[j];
                arr[j] = min;
            }

            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                    point++;
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
            iteritsii++;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish-start;

        System.out.println(Arrays.toString(arr));

        System.out.println("Прошло времени, нс: " + elapsed);
        System.out.println("Число обменов элементов: " + point);
        System.out.println("Число итераций: " + iteritsii);
    }
}
