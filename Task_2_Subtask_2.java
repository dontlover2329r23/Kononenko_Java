import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Принимаем две строки от пользователя
            System.out.print("Введите первую строку (a): ");
            String a = scanner.nextLine();
            System.out.print("Введите вторую строку (b): ");
            String b = scanner.nextLine();

            // Сравнение строк
            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }

    }
}
