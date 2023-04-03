package calculate;

public class Calculator {
    public void addition(int a, int b) {
        int ans = (a + b);
        System.out.println("Addition of " + ans);
    }

    public void subtraction(int a, int b) {
        int ans = (a - b);
        System.out.println("subtraction of" + ans);
    }

    public void multiplication(int a, int b) {
        int ans = (a * b);
        System.out.println("Multiplication of" + ans);
    }

    public void division(int a, int b) {
        int ans = (a / b);
        System.out.println("Division of " + ans);
    }

    public void calculateResul(int a, int b, char c) {
        if (c == '+') {
            addition(a, b);
        } else if (c == '-') {
            subtraction(a, b);

        } else if (c == '*') {
            multiplication(a, b);
        } else if (c == '/') {
            division(a, b);
        }


    }


}
