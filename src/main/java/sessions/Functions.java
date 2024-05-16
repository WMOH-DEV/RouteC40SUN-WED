package sessions;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Functions {
    public static void main(String[] args) {
        // Object result = add("hello"," there");
        // int result = getMax(5,9);
        // int result = factorial(4);
        // int result = inputFactorial();
        // int result = reverseNumber(5478);
        System.out.println(0);
    }

    // public static int add(int num1, int num2)
    // {
    // return num1 + num2;
    // }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static int factorial(int number) {
        if (number == 0) {
            return number;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int inputFactorial() {
        Scanner input = new Scanner(System.in);
        return factorial(input.nextInt());
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void checkRange(int start, int end) {

    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static Object add(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (int) a + (int) b;
        } else {
            return String.valueOf(a) + String.valueOf(b);
        }
    }

    // =============== End of functions =======================//

}
