package catalog_3;

import java.util.Scanner;

//написать программу для решения задачи. Задан массив из слов. Слова вводятся с клавиатуры. Найти в нем слово, в котром расстояние между первой и последней буквами "о" минимальное. Вывести найденное слово (например для слов "окно", "зоопарк", "пароход" ответом будет "зоопарк", так как разница между позициями букв "о" равна 1)
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество слов в массиве: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        String minDistanceWord = null;
        int minDistance = Integer.MAX_VALUE;

        for (String word : words) {
            int firstOIndex = word.indexOf('о');
            int lastOIndex = word.lastIndexOf('о');

            if (firstOIndex != -1 && lastOIndex != -1) {
                int distance = Math.abs(lastOIndex - firstOIndex);
                if (distance < minDistance) {
                    minDistance = distance;
                    minDistanceWord = word;
                }
            }
        }

        if (minDistanceWord != null) {
            System.out.println("Слово с минимальным расстоянием между 'о': " + minDistanceWord);
        } else {
            System.out.println("Ни одно слово не содержит 'о'.");
        }

        scanner.close();
    }
}

