package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int point = 0;
        int counter, num, first, last;
        for(int i = 0; i<3; i++) {
            int[] arr = new int[100];
                int elementToSearch = 4                                                                                                                       ;

            for(int j = 0; j < arr.length; j++) {
                arr[j] = rand.nextInt(100);
            }

            Arrays.sort(arr);

            //binarySearch(arr, first, last, elementToSearch);

            System.out.println(Arrays.toString(arr));

            long start = System.nanoTime();

            if(arr[arr.length-1] !=elementToSearch){
                arr[arr.length - 1]=elementToSearch;
                for(int w=0;w<arr.length-1;w++){
                    while( arr[w]!=elementToSearch){
                        point++;
                        if(w==arr.length-1){
                            System.out.println("Элемент не найден");}
                        w++;
                    }
                    //System.out.println(w);
                }

            }else System.out.println(arr.length-1);


            /*
        // Линейный
            for (int index = 0; index < arr.length; index++) {
                point++;

                if (arr[index] == elementToSearch) {
                    //System.out.println(index);
                }

            }*/
            long finish = System.nanoTime();

            System.out.println("Прошло времени, нс: " + (finish-start));
            System.out.println("Примерное время прохода одного массива, нс: " + (finish-start)/3);
            System.out.println(point);
        }
    }
}

