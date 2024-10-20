package catalog_2;

import java.util.*;
import java.util.stream.Collectors;

// Дан список названий цветов (введен с клавиатуры) и их стоимость (получить случайны образом). Вывести из списка названия цыетов дороже k рублей. Определить, сколько таких цветов.

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите названия цветов через пробел: ");
        String colorsInput = scanner.nextLine();
        List<String> colors = Arrays.asList(colorsInput.split(" "));

        
        Random random = new Random();
        Map<String, Integer> colorPrices = new HashMap<>();
        for (String color : colors) {
            colorPrices.put(color, random.nextInt(1000)); 
        }

        System.out.println("Стоимости цветов:");
        for (Map.Entry<String, Integer> entry : colorPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " руб.");
        }

        System.out.print("Введите стоимость k: ");
        int k = scanner.nextInt();

        List<String> expensiveColors = colorPrices.entrySet().stream()
                .filter(entry -> entry.getValue() > k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Цвета дороже " + k + " рублей: " + expensiveColors);
        System.out.println("Количество цветов: " + expensiveColors.size());

        scanner.close();
    }
}