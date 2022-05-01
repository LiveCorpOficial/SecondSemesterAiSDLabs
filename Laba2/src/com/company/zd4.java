package com.company;

import java.io.*;


public class zd4 {
    public static void main(String[] args) throws IOException {

        File file = new File("zd4.txt");
        FileInputStream fis = new FileInputStream(file);

        //String MyWord = "00"; // не выводит 00 или слова

        byte[] content = new byte[fis.available()]; //Возвращает оценку количества оставшихся байтов, которые можно прочитать (или пропустить) из этого входного потока без блокировки при следующем вызове метода для этого входного потока. Возвращает 0, когда позиция файла находится за пределами EOF. Следующим вызовом может быть тот же или другой поток.
        fis.read(content);
        fis.close();
        String[] lines = new String(content).split("\n");

        int i = 1;
        for (String line : lines) {
            String[] words = line.split(" ");
            int j = 1;
            for (String word : words) {
                boolean got = word.contains("000");
                if(got){
                    System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
                }

                j++;
            }
            i++;
        }

    }
}