package catalog_1;

import java.util.Random;

//написать программу, которая сформирует массив из n нечетных чисел из промужутка [10, 50] случайным оюразом. Вывести  на экран элементы мссива, котрые при делении на 7 и на 4 дает одинаковые остатки

public class Exercise_2 {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];
        Random random = new Random();

        int min = 10;
        int max = 50;

        for (int i=0; i < n; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("Элементы массива: ");

        for (int number : numbers) {
            if (number % 7 == number % 5) {
                System.out.println(number + " ");
            }
        }
    }
}
