package home_work_week_9;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_Iterater {
    public static void main(String[] args) {
        Programme_5_Iterater obj = new Programme_5_Iterater();
        obj.fruits();

    }

    public void fruits() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Kiwi");
        System.out.println(list);

        //Using Iterator

        Iterator itr = list.iterator();
        System.out.println("The ArrayList Elements are :");

        while (itr.hasNext()) {
            System.out.println(itr.next());


        }
    }
}