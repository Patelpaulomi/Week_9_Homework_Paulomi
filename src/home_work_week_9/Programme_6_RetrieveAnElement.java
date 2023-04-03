package home_work_week_9;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */


import java.util.ArrayList;

public class Programme_6_RetrieveAnElement {
    public static void main(String[] args) {
        Programme_6_RetrieveAnElement obj = new Programme_6_RetrieveAnElement();
        obj.cars();

    }

    public void cars() {

        // Create car list

        ArrayList<String> car = new ArrayList<>();

        car.add("Honda");
        car.add("Toyota");
        car.add("Audi");
        car.add("Tesla");
        car.add("Mercedes");

        System.out.println(car);

        //Retrieve Third and fifth element

        String element = car.get(2);
        System.out.println("Third element :" + element);
        element = car.get(4);
        System.out.println("Fifth element :" + element);
    }
}
