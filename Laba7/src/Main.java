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
        private static Queue stack;
        private static SQueue sstack;
        public static void MainMenu() throws IOException {
            System.out.println("Выберите вид очереди:\n1) Цепная очередь\n2) Сплошная очередь");
            System.out.print("> ");
            int choice = (char)System.in.read();
            if(choice == '1'){
                stack = new Queue();
                Queue();
            }
            if(choice == '2'){
                System.out.println("Введите кол-во элементов в очереди: ");
                System.out.print("> ");
                System.in.skip(10);
                choice = (int) System.in.read();
                sstack = new SQueue(choice);
                SQueue();
            }
        }
        private static void Queue() throws IOException {
            System.out.println("""
                    Введите пункт меню:
                    1)Добавить элемент в очередь
                    2)Достать первый элемент
                    3)Вывести очередь
                    4)Проверить на пустоту""");
            System.out.print("> ");
            System.in.skip(2);
            int choice = (char) System.in.read();
            switch (choice) {
                case ('1') -> {
                    System.out.print("Введите элемент очереди: ");
                    Scanner scanner = new Scanner(System.in);
                    int num = scanner.nextInt();
                    stack.push(num);
                    Queue();
                }
                case ('2') -> {
                    System.out.println("Достали элемент: " + stack.pop());
                    Queue();
                }
                case ('3') -> {
                    System.out.println("Очередь: ");
                    stack.output_queue();
                    Queue();
                }
                case ('4') -> {
                    System.out.println("Очередь пуста: " + stack.isEmpty());
                    Queue();
                }
            }
        }

        private static void SQueue() throws IOException {
            System.out.println("""
                    Введите пункт меню:
                    1)Добавить элемент в очередь
                    2)Достать первый элемент
                    3)Вывести очередь
                    4)Проверить на пустоту""");
            System.out.print("> ");
            System.in.skip(2);
            char choice = (char) System.in.read();
            switch (choice) {
                case ('1') -> {
                    System.out.print("Введите элемент очереди: ");
                    Scanner scanner = new Scanner(System.in);
                    int num = scanner.nextInt();
                    sstack.push(num);
                    SQueue();
                }
                case ('2') -> {
                    System.out.println("Достали элемент: " + sstack.pop());
                    SQueue();
                }
                case ('3') -> {
                    System.out.print("Очередь: ");
                    sstack.output_queue();
                    System.out.println();
                    SQueue();
                }
                case ('4') -> {
                    System.out.println("Очередь пуста: " + sstack.isEmpty());
                    SQueue();
                }
            }
        }
    }
}

