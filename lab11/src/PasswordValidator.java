import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите пароль (или введите 'exit' для выхода): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            if (isValidPassword(input)) {
                System.out.println("Пароль надежный.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        }
    }

    private static boolean isValidPassword(String password) {
        // Регулярное выражение для проверки надежности пароля
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

        // Компилируем регулярное выражение
        Pattern pattern = Pattern.compile(passwordPattern);

        // Создаем Matcher для введенного пароля
        Matcher matcher = pattern.matcher(password);

        // Проверяем соответствие регулярному выражению
        return matcher.matches();
    }
}
