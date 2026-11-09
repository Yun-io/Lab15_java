import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("sport.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Вид спорта: Плавание.\n");
            fw.write("Польза: развивает вродь выносливость и укрепляет мышцы.");
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер файла: " + file.length() + " байт");

        System.out.println("\nСодержимое файла");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
