package home_work_week_9;
//Write a Java program to test if an array list is empty or not.

import java.util.ArrayList;

public class Programme_7_Empty_Or_Not {
    public static void main(String[] args) {
        Programme_7_Empty_Or_Not obj = new Programme_7_Empty_Or_Not();
        obj.empty();

    }

    public void empty() {
        //Array list
        ArrayList<String> colour = new ArrayList<>();

        colour.add("Red");
        colour.add("Blue");
        colour.add("White");
        colour.add("Black");
        //Remove
        System.out.println("Original array list :" + colour);
        System.out.println("Checking the above array list is empty or not!" + colour.isEmpty());
        colour.removeAll(colour);
        System.out.println("Array list after remove all elements" + colour);
        System.out.println("Checking the above array list is empty or not!" + colour.isEmpty());
    }
}
