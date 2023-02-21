package org.example;

/* Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей*/

public class Task2 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 5, 8, 10, 12, 15, 47};
        int[] arr = { 10, 5, 3, 1, -4, -5 };
        boolean isGrowing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isGrowing = true;
            } else {
                isGrowing = false;
                break;
            }
        }
        if (isGrowing) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность убывающая");
        }
    }
}
