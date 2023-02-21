package org.example;

import java.util.Arrays;

/* Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива */

public class Task3 {
    public static void main(String[] args) {
        int[] arr = { 1, 12, -2, -1, 3, 98, 10111, -10 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = getIsumm(arr);
            }
        }

        System.out.println("Итоговый массив = " + Arrays.toString(arr));
    }

    public static int getIsumm(int[] input) {
        int a = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0 && String.valueOf(input[i]).length() == 2) {
                a += i;
            }
            System.out.println(i + " " + a);
        }
        return a;
    }
}
