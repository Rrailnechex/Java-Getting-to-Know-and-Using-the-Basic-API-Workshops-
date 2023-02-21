package org.example;

/*Сведения о товаре состоят из
наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */

import org.example.model.TheItems1;
import org.example.model.TheItems2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        TheItems2 item_a = new TheItems2("банаблоко","voronezh", 5.99f,45.44f,1);
        TheItems2 item_b = new TheItems2("вишнёвка","китай", 2.45f, 10.09f,2);
        TheItems2 item_c = new TheItems2("яюлинка","влад", 3.24f, 12.01f,3);
        TheItems2 item_d = new TheItems2("крючя","прохожий", 8.75f, 45.44f,2);
        TheItems2 item_e = new TheItems2("картонка","дождь", 2.05f, 75.45f,3);
        TheItems2 item_f = new TheItems2("мель","антидождь", 1.01f, 45.44f,2);

        List<TheItems2> itemsCatalog = new ArrayList<>();
        itemsCatalog.add(item_a);
        itemsCatalog.add(item_b);
        itemsCatalog.add(item_c);
        itemsCatalog.add(item_d);
        itemsCatalog.add(item_e);
        itemsCatalog.add(item_f);
        System.out.println(itemsCatalog);

        /*Получить наименования товаров заданного сорта с наименьшей ценой*/

        List<TheItems2> selectedItems = new ArrayList<>();

        for (int i = 0; i < itemsCatalog.size(); i++) {
            if (itemsCatalog.get(i).getSort() == 2) {
                selectedItems.add(itemsCatalog.get(i));
            }
        }

        List<Float> cost_cheepest = new ArrayList<>();

        for (int i = 0; i < selectedItems.size(); i++) {
                cost_cheepest.add(selectedItems.get(i).getCost());
        }

        cost_cheepest.sort(Collections.reverseOrder());

        //System.out.println(cost_cheepest);
        //System.out.println(cost_cheepest.get(0));

        Float the_cost_cheepest = cost_cheepest.get(0);

        for (int i = 0; i < selectedItems.size(); i++) {
            if (selectedItems.get(i).getCost().equals(the_cost_cheepest)) {
                System.out.println(selectedItems.get(i).getName());
            }
        }


    }
}
