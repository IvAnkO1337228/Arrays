package catalog_1;
import java.util.Random;

//написать программу, которая сформирует массив из n чисел из промежутка [-60, 60] случайным образом. Вывести на экран элементы массива, кратные 3

public class Exercise_1 {
    public static void main(String[] args ) {
        int n = 10;
        int[] numbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(121) - 60;
        }

        System.out.println("Элементы массива, кратные 3: ");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number + " ");
            }
        }

    }
}
