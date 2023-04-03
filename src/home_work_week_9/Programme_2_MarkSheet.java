package home_work_week_9;
/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */


import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name    \t \t:\t");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();

        // Entering the marks for Maths,English and Science

        System.out.print("Enter Marks of Subject Maths \t:\t");
        int mathMarks = scanner.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
            mathMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science\t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t\t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks \t\t:\t");
            englishMarks = scanner.nextInt();
        }

        //Calculating the percentage

        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculationResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculationGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //Closing scanner
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the results on subjects marks
    public static String calculationResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "pass";
        }
    }

    //calculating the grade on percentage and result
    public static String calculationGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "c";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    //printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("--------------------------------");
        System.out.println("|                               |");
        System.out.println("| Mark Sheet                    |");
        System.out.println("|_______________________________|");
        System.out.println("| Name :" + name + "                     |");
        System.out.println("| Roll No:" + rollNum + "                     |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks              |");
        System.out.println("|_______________________________|");
        System.out.println("| Math :" + mathMarks + "                       |");
        System.out.println("| Science :" + scienceMarks + "                        ");
        System.out.println("| English:" + englishMarks + "                     |");
        System.out.println("|_________________________________|");
        System.out.println("| Total:" + total + "               |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");


    }

}