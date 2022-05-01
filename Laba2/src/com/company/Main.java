package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
                File file = new File("zd1.txt");
                Scanner console = new Scanner(file);
                PrintWriter pw = new PrintWriter(file);

                // Исправил недостаток (раньше длина массива задавалась мною, теперь убрал!)
                pw.println("1 2 -1 -3 8 -2");
                pw.close();

                 /*
                for(int i = 0; i<numbers.length;i++){
                if(value < numbers[i]) {
                    value++;
                }
                }*/

                String line = console.nextLine();
                String[] numbersString = line.split(" ");

                //Integer[] q = Integer.parseInt(numbersString[1]);
                // int[] numbers = new int[4];

                int numbers[] = new int[numbersString.length];
                 int counter = 0;
                for(String number: numbersString){
                    numbers[counter++] = Integer.parseInt(number);
                }
                System.out.println(Arrays.toString(numbers));

                for(int value : numbers){
                    if(value<0){
                        System.out.println(value);
                    }
                }
                console.close();
    }
}