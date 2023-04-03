package home_work_week_9;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Declare following two arrylist and compare it.
 * <p>
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11_CompareTwoArrayList {
    public static void main(String[] args) {
        Programme_11_CompareTwoArrayList obj = new Programme_11_CompareTwoArrayList();
        obj.compare();

    }

    public void compare() {

        //First Array list

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("First Array list :" + c1);

        // Second Array list

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("Second Array list :" + c2);

        //Blank space

        System.out.println();

        //Compare c1 and c2

        System.out.println("Common element :" + c1.stream().filter(c2::contains).collect(Collectors.toList()));

        c1.removeAll(c2);
        System.out.println("Un-common element from both arraylist : " + c1);


    }
}





