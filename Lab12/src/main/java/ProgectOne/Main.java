package ProgectOne;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Plant> plantMap = new HashMap<>();

        plantMap.put("Дуб", new Tree("Дуб", 1, 15.0, 5.5));
        plantMap.put("Береза", new Tree("Береза", 2, 10.0, 3.0));
        plantMap.put("Сосна", new Tree("Сосна", 3, 18.0, 4.0));

        plantMap.put("Роза", new Flower("Роза", 4, 0.8, "Красный"));
        plantMap.put("Тюльпан", new Flower("Тюльпан", 5, 0.4, "Желтый"));
        plantMap.put("Ромашка", new Flower("Ромашка", 6, 0.3, "Белый"));

        plantMap.put("Сирень", new Shrub("Сирень", 7, 2.5, 10));
        plantMap.put("Малина", new Shrub("Малина", 8, 1.2, 8));


        for (Map.Entry<String, Plant> entry : plantMap.entrySet()) {
            String key = entry.getKey();
            Plant value = entry.getValue();
            System.out.println("Ключ: " + key + ", Значение  " + value);
        }
    }
}
