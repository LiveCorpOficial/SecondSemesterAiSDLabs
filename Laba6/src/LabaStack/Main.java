package LabaStack;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Menu.MainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Menu{
        private static Stack stack;
        private static SStack sstack;
        public static void MainMenu() throws IOException {
            System.out.println("""
                    Выберите вид стека:
                    1) Цепной стек
                    2) Сплошной стек""");
            System.out.print("> ");
            int choice = (char)System.in.read();
            if(choice == '1'){
                stack = new Stack();
                Stack();
            }
            if(choice == '2'){
                System.out.print("Введите кол-во элементов стека: ");
                System.in.skip(10);
                choice = System.in.read();
                sstack = new SStack(choice);
                SStack();
            }
        }
        private static void Stack() throws IOException {
            System.out.println("""
                    Введите команду:\s
                    1) Добавить элемент
                    2) Достать последний
                    3) Показать стек
                    4) Проверить на пустоту
                    5) Назад""");
            System.out.print("> ");
            System.in.skip(2);
            int choice = (char) System.in.read();
            switch (choice) {
                case ('1') -> {
                    System.out.print("Введите элемент стека: ");
                    Scanner scanner = new Scanner(System.in);
                    int num = scanner.nextInt();
                    stack.push(num);
                    Stack();
                }
                case ('2') -> {
                    System.out.println("Достали элемент: " + stack.pop());
                    Stack();
                }
                case ('3') -> {
                    System.out.println("Стек: ");
                    stack.output_stack();
                    Stack();
                }
                case ('4') -> {
                    System.out.println("Стек пуст: " + stack.isEmpty());
                    Stack();
                }
            }
        }

        private static void SStack() throws IOException {
            System.out.println("""
                    Введите команду:\s
                    1)Добавить элемент
                    2)Достать последний
                    3)Показать стек
                    4)Проверить на пустоту""");
            System.out.print("> ");
            System.in.skip(2);
            char choice = (char) System.in.read();
            switch (choice) {
                case ('1') -> {
                    System.out.print("Введите элемент стека: ");
                    Scanner scanner = new Scanner(System.in);
                    int num = scanner.nextInt();
                    sstack.push(num);
                    SStack();
                }
                case ('2') -> {
                    System.out.println("Достали элемент: " + sstack.pop());
                    SStack();
                }
                case ('3') -> {
                    System.out.print("Стек: ");
                    sstack.output_stack();
                    System.out.println();
                    SStack();
                }
                case ('4') -> {
                    System.out.println("Стек пуст: " + sstack.isEmpty());
                    SStack();
                }
            }
        }
    }
}
