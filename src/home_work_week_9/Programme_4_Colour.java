package home_work_week_9;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */


import java.util.ArrayList;

public class Programme_4_Colour {
    public static void main(String[] args) {
        Programme_4_Colour obj = new Programme_4_Colour();
        obj.colour();
    }

    public void colour() {

        ArrayList<String> list = new ArrayList<>();

        list.add("Blue");
        list.add("Red");
        list.add("White");
        list.add("Black");
        list.add("Pink");

        //For Each Loop

        for (String a : list) {
            System.out.println(a);
        }
    }
}