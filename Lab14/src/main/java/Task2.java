import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("f.txt");

        System.out.println("Введите 10 целых чисел:");

        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                if (!scanner.hasNextInt()) {
                    System.err.println("Ошибка: Введено не целое число! Работа программы прекращена.");
                    return;
                }
                int number = scanner.nextInt();
                pw.print(number + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        System.out.print("\nЧисла, считанные из файла f.txt: ");
        int count = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int numberFromFile = fileScanner.nextInt();
                System.out.print(numberFromFile + " ");
                if (numberFromFile % 3 == 0) {
                    count++;
                }
            }
            System.out.println("\nКоличество чисел, кратных 3: " + count);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }
}
