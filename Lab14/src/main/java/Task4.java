import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        File file = new File("distance.txt");

        System.out.println("Введите 10 вещественных значений расстояния (через точку, например 10.5):");

        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                if (!scanner.hasNextDouble()) {
                    System.err.println("Ошибка: Введено не вещественное число! Работа программы прекращена.");
                    return;
                }
                double distance = scanner.nextDouble();

                if (distance < 0) {
                    System.err.println("Ошибка: Расстояние не может быть отрицательным! Работа программы прекращена.");
                    return;
                }

                pw.print(distance + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        double sum = 0;
        int totalCount = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.useLocale(Locale.US);
            System.out.print("\nРасстояния из файла: ");

            while (fileScanner.hasNextDouble()) {
                double distanceFromFile = fileScanner.nextDouble();
                System.out.print(distanceFromFile + " ");
                sum += distanceFromFile;
                totalCount++;
            }

            if (totalCount > 0) {
                double average = sum / totalCount;
                System.out.printf(Locale.US, "\nСреднее расстояние: %.2f км\n", average);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
