package org.example;

/* Подсчитать количество искомого слова,
через map (наполнением значение, где искомое слово будет являться ключом)
 */

public class Task2 {
    public static void main(String[] args) {
        String initialStr = "События первой части части первого тома тома романа «Война и мир» происходят тома в 1805 году году тома году году году году году году году году году тома тома тома году году году году году году году";
        initialStr = initialStr.toLowerCase();
        String[] splitedStr = initialStr.split("\\s+");

        String iscomoeSlovo = "тома";

        int ammount = 0;

        for (int i = 0; i < splitedStr.length; i++) {
            if (splitedStr[i].equals(iscomoeSlovo)) {
                ammount++;
                System.out.println("ammount was incresed = " + ammount);
            }
            System.out.println(i + " " + splitedStr[i]);
        }

        System.out.println();
        System.out.println(ammount + " " + iscomoeSlovo + " in the text");

    }
}
