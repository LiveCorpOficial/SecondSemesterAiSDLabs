package com.company;

import java.util.Arrays;
import java.util.Random;

public class Pyzir {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[50];
        int point = 0;
        int iteritsii = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        long start = System.currentTimeMillis();
        boolean Flag = false;
        while (!Flag) {
            Flag = true;
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr.length * 0.25; j++) {
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
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    Flag = false;
                    point++;
                }
            }
            iteritsii++;
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println(Arrays.toString(arr));

        System.out.println("Прошло времени, нс: " + elapsed);
        System.out.println("Число обменов элементов: " + point);
        System.out.println("Число итераций: " + iteritsii);
    }
}

//