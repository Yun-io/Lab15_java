import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("f5.txt");
        Random random = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                pw.print((random.nextInt(50) + 1) + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл f5: " + e.getMessage());
        }


        int count = 0;
        System.out.print("Числа, считанные из файла f5.txt: ");

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int numFromFile = fileScanner.nextInt();
                System.out.print(numFromFile + " ");

                if (numFromFile % 4 == 0) {
                    count++;
                }
            }
            System.out.println("\nКоличество чисел, кратных 4: " + count);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }
}
