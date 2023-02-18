package org.example;

/*Дана последовательность N целых чисел. Найти сумму простых чисел */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10, 12, 11};
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i]) == true) {
                summ += arr[i];
            }
            System.out.println(i + " " + arr[i] + " " + summ);
        }
        System.out.println("Final result = " + summ);
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        } else if (num > 1) {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
