package org.example;

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> initialList = new LinkedList<>();

        // я пытался создать лист в одну строчку но почему-то не получилось
        // "(",")","{","}","[","]"
        initialList.add("(");
        initialList.add(")");
        initialList.add("{");
        // initialList.add("}");
        initialList.add("[");
        initialList.add("]");
        System.out.println(initialList);

        boolean answer = true;

        // я пытался заменить if на switch но почему-то не получилось
        // я пытался заменить этот блок кода на метод, но почему-то не получилось
        for (int i = 0; i < initialList.size() - 1; i++) {
            if (initialList.get(i).equals("(")) {
                if (!initialList.get(i + 1).equals(")")) {
                    answer = false;
                    break;
                }
            } else if (initialList.get(i).equals("{")) {
                if (!initialList.get(i + 1).equals("}")) {
                    answer = false;
                    break;
                }
            } else if (initialList.get(i).equals("[")) {
                if (!initialList.get(i + 1).equals("]")) {
                    answer = false;
                    break;
                }
            }
        }

        if (answer) {
            System.out.println("List is correct");
        } else {
            System.out.println("List is not correct");
        }
    }
}
