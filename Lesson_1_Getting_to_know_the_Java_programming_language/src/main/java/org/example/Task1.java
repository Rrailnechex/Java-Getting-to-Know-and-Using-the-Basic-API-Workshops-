package org.example;

/*
Дана последовательность целых чисел, оканчивающаяся нулем.
Найти сумму положительных чисел, после которых следует отрицательное число.

Пример: 1 2 1 2 -1 1 3 1 3 -1 0

2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5
*/

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i + 1] < 0) {
                summ += arr[i];
            }
            System.out.println(i + " " + summ);
        }
        System.out.println("Final result = " + summ);
    }
}
