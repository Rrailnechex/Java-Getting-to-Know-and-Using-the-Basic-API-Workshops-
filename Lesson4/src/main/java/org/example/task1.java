package org.example;
import java.util.LinkedList;

/* Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> initialList = new LinkedList<>();
        LinkedList<Integer> reversedList = new LinkedList<>();

        // fill
        for (int i = 1; i <= 10; i++) {
            initialList.add(i);
        }

        // reverse
        for (int i = initialList.size() - 1; i >= 0; i--) {
            reversedList.add(initialList.get(i));
            System.out.println("-----------");
            System.out.println(i+"initialList"+initialList);
            System.out.println(i+"reversedList"+reversedList);
        }
        System.out.println("-----------");
        System.out.println("Final results:");
        System.out.println("initialList"+initialList);
        System.out.println("reversedList"+reversedList);
        //System.out.println(reversedList.toString().replaceAll("\\\\[|\\\\]|,", ""));
    }
}

