package home_work_week_9;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme_9_HashMap {
    public static void main(String[] args) {

        //Create a HasMap object called people

        HashMap<String, Integer> people = new HashMap<>();
        //Add key and values ( Name , Age )

        people.put("Paula", 35);
        people.put("Dev", 25);
        people.put("Mark", 20);

        //foreach loop

        for (String i : people.keySet()) {
            System.out.println("Name : " + i + " Age : " + people.get(i));

        }
    }
}
