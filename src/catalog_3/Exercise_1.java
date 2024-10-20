package catalog_3;

import java.util.Random;

//Написать программу для решения задачи. В массиве хранятся целые числа. Числа получить случайным образом. Вывести все элементы массива кроме тех, котрые расположены между min и max (max может находиться в массиве раньше чем min, например для массива 1 7 3 5 -2 4 нужно вывести: 1 7 -2 4)


public class Exercise_1 {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];

        Random random = new Random();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(101);
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int minIndex = -1;
        int maxIndex = -1;
        
        for (int i = 0; i < n; i++) {
            if (numbers[i] == min) {
                minIndex = i;
            }
            if (numbers[i] == max) {
                maxIndex = i;
            }
        }

        int start = Math.min(minIndex, maxIndex);
        int end = Math.max(minIndex, maxIndex);

       
        for (int i = 0; i < n; i++) {
            if (i < start || i > end) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}