package org.example;

import org.example.model.TheItems2;
import org.example.model.TheItems3;

import java.util.ArrayList;
import java.util.List;

/*Сведения о книге состоят из
названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц,
 фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Task3 {
    public static void main(String[] args) {
        TheItems3 item_a = new TheItems3("Maze","Aann",45.21f, 2100,179);
        TheItems3 item_b = new TheItems3("Towers","Aaikl",999.99f, 2011,181);
        TheItems3 item_c = new TheItems3("Flowers","Aor",64.59f, 2000,191);
        TheItems3 item_d = new TheItems3("Cucumbers","tktktk",10.25f, 1996,4);

        List<TheItems3> booksCatalog_a = new ArrayList<>();
        booksCatalog_a.add(item_a);
        booksCatalog_a.add(item_b);
        booksCatalog_a.add(item_c);
        booksCatalog_a.add(item_d);
        // System.out.println(booksCatalog_a);

        
        // Найти названия книг, в которых простое количество страниц
        // фамилия автора содержит «А»
        // год издания после 2010 г, включительно
        for (int i = 0; i < booksCatalog_a.size(); i++) {
            if (!isPrimeNumber(booksCatalog_a.get(i).getPages()) ||
                    !booksCatalog_a.get(i).getAuthor().contains("A") ||
                    booksCatalog_a.get(i).getYear() < 2010) {
                booksCatalog_a.remove(i);
            }
            else { // Найти названия книг
                System.out.println(booksCatalog_a.get(i).getName());
            }
        }

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
