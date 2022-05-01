package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void printset (){
        System.out.println("Введите Массив: ");
        Scanner console = new Scanner(System.in);
       int[] a = new int[5];
       for (int i=0;i<5;i++){
           a[i] = console.nextInt();
       }
        System.out.println("Итоговый массив: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("\nОбщее колличество: " + a.length);
    }
/*
    public static void zd2() {
        LinkedHashSet<String> word1 = new LinkedHashSet<>();
        LinkedHashSet<String> word2 = new LinkedHashSet<>();
        String sentence1 = "i am a rockstar she is a devil inside";
        String sentence2 = "she is a popstar and i am love your";
        sentence1 = sentence1.replaceAll("\\pP", "");
        sentence2 = sentence2.replaceAll("\\pP", "");
        String[] arrSplit1 = sentence1.split(" ");
        String[] arrSplit2 = sentence2.split(" ");

        Collections.addAll(word1, arrSplit1);
        for (int i = 0; i < arrSplit2.length; i++) {
            word2.add(arrSplit2[i]);
        }

        LinkedHashSet<String> union = new LinkedHashSet<>(word1);
        union.retainAll(word2);


        for (var it = union.iterator(); it.hasNext(); ) {
            var temp = it.next();
            System.out.println(temp);
        }
    }
*/

    public static class zd2 {
        public void Fun2() {
            String str1 = "десять два шесть восемь осьминог один";
            String[] words = str1.split(" ");

            String str2 = "один два три четыре пять шесть семь восемь девять осьминог";
            String[] words1 = str2.split(" ");



            HashSet<String> str11 = new LinkedHashSet<>();
            for(int i=0; i< words.length ;i++)
                str11.add(words[i]);
            HashSet<String> str22 = new LinkedHashSet<>();
            for(int i=0; i< words1.length ;i++)
                str22.add(words1[i]);
            System.out.println(str11);
            System.out.println(str22);
            System.out.println("\nВстречающиеся в обоих мн-вах: ");
            for(String k: str11)
            for(String m: str22)
            {
                if (k.equals(m))
                System.out.println(k);
            }
        }
    }
    /*
    public static void zd3(){
        /*
        final var stack = Set.of(1, "f", 23, "г", "g", 0, "i", "к", "ь", "п", 4);
        final var ints = stack.stream().filter(Integer.class::isInstance).collect(Collectors.toSet());
        final var str = stack.stream().filter(String.class::isInstance).collect(Collectors.toSet());
        //final var en1 = str.stream().filter(b->{if(b >= '4' && b <= 'z') else if }).collect(Collectors.toSet());
        final var en = stack.stream().filter(i-> "a".equals(i) || "b".equals(i) || "c".equals(i) || "d".equals(i) || "e".equals(i) || "f".equals(i) || "g".equals(i) || "h".equals(i) || "i".equals(i) || "j".equals(i) || "k".equals(i) || "l".equals(i) || "m".equals(i) || "n".equals(i) || "o".equals(i) || "p".equals(i) || "q".equals(i) || "r".equals(i) || "s".equals(i) || "t".equals(i) || "u".equals(i) || "v".equals(i) || "w".equals(i) || "x".equals(i) || "y".equals(i) || "z".equals(i)).collect(Collectors.toSet());
        final var sss = str.stream().filter(ch -> Character.UnicodeBlock.of(ch).equals(Character.UnicodeBlock.CYRILLIC)).mapToObj(ch -> (char) ch).forEach(ch -> System.out.println(ch));
        final var ru = stack.stream().filter(i-> "а".equals(i) || "б".equals(i) || "в".equals(i) || "г".equals(i) || "д".equals(i) || "е".equals(i) || "ё".equals(i) || "ж".equals(i) || "з".equals(i) || "и".equals(i) || "й".equals(i) || "к".equals(i) || "л".equals(i) || "м".equals(i) || "н".equals(i) || "о".equals(i) || "п".equals(i) || "р".equals(i) || "с".equals(i) || "т".equals(i) || "у".equals(i) || "ф".equals(i) || "х".equals(i) || "ц".equals(i) || "ч".equals(i) || "ш".equals(i) || "щ".equals(i) || "ъ".equals(i) || "ы".equals(i) || "ь".equals(i) || "э".equals(i) || "ю".equals(i) || "я".equals(i)).collect(Collectors.toSet());
        System.out.println("Заданный массив: " + stack);
        System.out.println("Все числа: " + ints);
        System.out.println("Все буквы: " + str);
        System.out.println("Только en: " + en);
        System.out.println("Только ru: " + ru);
        Object[] a = {1, 'ш', 2, 'g', 3, 'э', 'v', 'm', 'м'};
        String regex = "";
        Pattern pattern = Pattern.compile(regex);
        for(Object b : a){
            Matcher matcher = pattern.matcher(b);
        }
        for (int i = 0; i<=8;i++){
            a[i] = "";
        }

        }
*/
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Задание 1\n");
        printset();
        console.nextLine();
/*
        System.out.println("Задание 2\n");
        zd2();
        console.nextLine();
*/
        zd2 Object2;
        Object2 = new zd2();
        Object2.Fun2();
    }

}
