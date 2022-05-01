package LabaStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void Splosh(){
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        while(answer != 5){
            System.out.println("""
                    Выберете пункт меню:
                    1. Добавить элемент
                    2. Удалить элемент
                    3. Очистить
                    4. Посмотреть стек
                    5. Назад
                    """);
            System.out.print("Введите номер команды: ");answer = sc.nextInt();
            if(answer == 1){
                System.out.println("Введите элемент: "); int a = sc.nextInt();
                stack.push(a);
                System.out.println("\nЭлемент добавлен!");
            }   else if(answer == 2)    {
                stack.pop();
                System.out.println("Элемент удалён!\n");
            }   else if(answer == 3)    {
                stack.clear();
            }   else if(answer == 4)    {
                System.out.println("\nВаш стек: " + stack + "\n");
            }   else if(answer == 5)    {
                break;
            }   else
                System.out.println("Такого пункта нет!");
        }
    }

    public static void Tsepn(){
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int y = 0;
        int answer = 0;
        while(answer != 5){
            System.out.println("""
                    Выберете пункт меню:
                    1. Добавить элемент
                    2. Удалить элемент
                    3. Посмотреть стек
                    4. Назад
                    """);
            System.out.print("Введите номер команды: ");answer = sc.nextInt();
            if(answer == 1) {
                System.out.println("Введите элемент: ");
                y++;
                a = sc.nextInt();
                list.add(a);

                System.out.println("\nЭлемент добавлен!");
            }   else if(answer == 2)    {
                stack.addAll(list);
                stack.pop();
                list.clear();
                System.out.println("Элемент удалён!\n");
            }   else if(answer == 3)    {
                stack.addAll(list);
                list.clear();
                System.out.println("\nВаш стек: " + stack + "\n");
            }   else if(answer == 4)    {
                break;
            }   else
                System.out.println("Такого пункта нет!");
        }
    }

    public static void start(){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while(true){
            System.out.println("\nВыберете способ представления стека:\n1. Сплошной \n2. Цепной\n3. Выйти");
            int answer;
            System.out.print("> ");answer = sc.nextInt();
            if(answer == 1){
                Stack<Integer> str = new Stack<>();
                Splosh();
            }   else if(answer == 2)   {
                Stack<Integer> stl = new Stack<>();
                Tsepn();
            }   else if(answer == 3){
                break;
            }   else
                System.out.println("Такого пункта нет!");
        }
    }

    public static void main(String[] args) {
        start();
    }
}
