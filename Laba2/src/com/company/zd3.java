package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class zd3 {

    public static void main(String[] args) throws IOException{
        String str = new String(Files.readAllBytes(Paths.get("zd3.txt")));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер строки:");
        int lineNumber = Integer.parseInt(scanner.nextLine()) - 1;
        scanner.close();
        String line;
        try{
            line = str.split("\n")[lineNumber];
            System.out.println(line);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Такой строки нет в файле");
        }
    }
}
