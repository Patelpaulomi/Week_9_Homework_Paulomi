package home_work_week_9;
//Write a Java program to reverse an array of integer values.

import java.util.ArrayList;

public class Programme_3_Reverse_Array {
    public static void main(String[] args) {
        Programme_3_Reverse_Array obj = new Programme_3_Reverse_Array();
        obj.number();

    }
        public void number(){
        ArrayList<Integer> list = new ArrayList<Integer>();
         //Array List
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int[] a = new int[]{10, 20, 30, 40, 50};

        System.out.print("Before Reverse  :  ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //Collection.reverse(list);
        System.out.println(); // for blank space
        System.out.print("After Reverse   :  ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}