package org.example;

/*Дан массив записей:
наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
название которых содержит «высший».
 */

import org.example.model.TheItems1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        TheItems1 item_a = new TheItems1("высший банаблоко",65, 1);
        TheItems1 item_b = new TheItems1("легендарный вишнёвка",43, 2);
        TheItems1 item_c = new TheItems1("обычный яюлинка",65, 3);
        TheItems1 item_d = new TheItems1("низший крючя",12, 3);
        TheItems1 item_e = new TheItems1("высший картонка",20, 2);
        TheItems1 item_f = new TheItems1("высший мель",7, 1);
        List<TheItems1> itemsCatalog = new ArrayList<>();
        itemsCatalog.add(item_a);
        itemsCatalog.add(item_b);
        itemsCatalog.add(item_c);
        itemsCatalog.add(item_d);
        itemsCatalog.add(item_e);
        itemsCatalog.add(item_f);
        System.out.println(itemsCatalog);

        Integer serchedSort_a = 1;
        Integer serchedSort_b = 2;
        String serchedName = "высший";

        for (int i = 0; i < itemsCatalog.size(); i++) {
            if (itemsCatalog.get(i).getSort() == serchedSort_a ||
                itemsCatalog.get(i).getSort() == serchedSort_b) {
                if (itemsCatalog.get(i).getName().contains(serchedName)) {
                    System.out.println(itemsCatalog.get(i).getName());
                }
            }

        }
    }
}