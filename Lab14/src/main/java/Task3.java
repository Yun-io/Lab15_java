import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File fileF = new File("f.txt");
        File fileG = new File("g.txt");
        File fileH = new File("h.txt");

        if (!fileF.exists()) {
            System.err.println("Ошибка: Файл f.txt не найден! Сначала запустите Задание 2.");
            return;
        }

        try (Scanner fileScanner = new Scanner(fileF);
             PrintWriter pwG = new PrintWriter(new FileWriter(fileG));
             PrintWriter pwH = new PrintWriter(new FileWriter(fileH))) {

            System.out.print("Читаем числа из f.txt и распределяем: ");
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");

                if (isPrime(num)) {
                    pwG.print(num + " ");
                } else {
                    pwH.print(num + " ");
                }
            }
            System.out.println("\nУспешно! Простые числа сохранены в g.txt, остальные — в h.txt.");

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
