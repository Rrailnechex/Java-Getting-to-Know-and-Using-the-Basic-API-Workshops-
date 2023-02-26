package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> db = new HashMap<>();
        db.putIfAbsent(1,"один");
        db.put(2,"два");
        db.put(3,"три");
        db.put(4,"четыре");
        db.put(20,"двадцать");

        doAllStuff(db);

        db.remove(1);

        doAllStuff(db);

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

    }

    private static void doAllStuff(Map<Integer, String> n) {
        System.out.println("start--------------------------");

        System.out.println(n);
        System.out.println(n.keySet());
        System.out.println(n.values());
        System.out.println(n.get(3));
        System.out.println(n.containsKey(1));

        System.out.println("end--------------------------");
    }
}