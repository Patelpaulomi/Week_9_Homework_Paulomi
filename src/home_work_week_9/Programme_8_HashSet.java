package home_work_week_9;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 *Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 *else)
 */


import java.util.HashSet;

public class Programme_8_HashSet {
    public static void main(String[] args) {


        //Create a HashSet object called number
        HashSet<Integer> number = new HashSet<>();

        //Add values to the set
        number.add(4);
        number.add(7);
        number.add(8);

        //Show which number between 1 and 10 are in the set
        //Using for loop and if else
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " was found in the set. ");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }

    }
}
