import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        while ( true) {
            Scanner scanner = new Scanner(System.in);

            // Принимаем два целых числа от пользователя
            System.out.print("Введите первое число (a): ");
            int a = 0;
            int b=0;
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();

            } else {
                System.out.println("Вы ввели не число!(a)");
                continue;
            }

            System.out.print("Введите второе число (b): ");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();

            } else {
                System.out.println("Вы ввели не число!(b)");
                continue;
            }
            // Сравнение чисел
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            // Операции с числами
            System.out.println("Сложение: " + (a + b));
            System.out.println("Вычитание (a-b): " + (a - b));
            System.out.println("Вычитание(b-a): " + (b- a));
            System.out.println("Умножение: " + (a * b));
            if (b != 0) {
                System.out.println("Деление(a/b): " + ((double) a / b));
            } else {
                System.out.println("Деление на ноль невозможно(b=0)");
            }
            if (a != 0) {
                System.out.println("Деление(b/a): " + ((double) b/a));
            } else {
                System.out.println("Деление на ноль невозможно(a=0)");
            }
        }
    }
}
