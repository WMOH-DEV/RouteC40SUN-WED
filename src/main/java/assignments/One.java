/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class One {

    public static void main(String[] args) {
        // call whatever method you want to test here :)
    }

    /**
     * Write a java program that read a number of the month And then print the name
     * of it in very basic way
     */
    public static void monthNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt();

        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number. Please enter a number between 1 and 12.";
                break;
        }

        // close scanner to prevent IDE warning ^_^
        scanner.close();

        System.out.println("The name of the month is: " + monthName);

    }

    /**
     * Write a java program that read a number of the month and print the month is
     * in Summer, spring, winter or autumn.
     */
    public static void monthSeason() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt();

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month number. Please enter a number between 1 and 12.";
                break;
        }

        // close scanner to prevent IDE warning again -_-!!
        scanner.close();

        System.out.println("The season is: " + season);
    }

    /**
     * The alphabets A, E, I, O and U (smallcase and uppercase) are known as Vowels
     * and rest of the alphabets are known as consonants. Here we will write a java
     * program that
     * checks whether the input character is vowel or Consonant.
     */
    public static void vowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        // Convert character to lowercase to simplify comparison
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((lowerCh >= 'a' && lowerCh <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }

        // close scanner -______-
        scanner.close();
    }

    /**
     * In this Program we are making a simple calculator that performs addition,
     * subtraction, multiplication and division based on the user input.
     * The program takes the value of both the numbers (entered by
     * user) and then user is asked to enter the operation (+, -, * and /), based on
     * the input program performs the selected operation on the entered numbers
     */
    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // double to allow decimal numbers as well :D

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to enter an operation
        System.out.print("Enter an operation, mn dol bs => [+, -, *, /]: ");
        char operation = scanner.next().charAt(0);

        // Perform the selected operation
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error -_-!! : Division by zero is not allowed. :) el3b 3.erha ");
                }
                break;
            default:
                System.out.println("Invalid operation. 7aga mn dol, balash 3.bawa +, -, *, /.");
                break;
        }

        // aah forgot to close the scanner O_o!
        scanner.close();
    }

    /**
     * Write a Java program to get a number from the user and print whether it is
     * positive or negative.
     */
    public static void positiveNegativeChecker() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero ya nase7");
        }

        // close the dammmm scanner
        scanner.close();
    }

    /**
     * Write a program which calculates marks on basis of given grades in java using
     * switch statement
     */
    public static void gradeToMarksCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade (A, B, or C) bs: ");

        char grade = scanner.next().toUpperCase().charAt(0);

        // System.out.print("Enter the marks: ");
        // int marks = scanner.nextInt();

        scanner.close();

        switch (grade) {
            case 'A':
                System.out.println("Grade A - Marks >= 80");
                break;
            case 'B':
                System.out.println("Grade B - Marks >= 60 && < 80");
                break;
            case 'C':
                System.out.println("Grade C - Marks >= 40 && < 60");
                break;
            case 'F':
                System.out.println("Grade F - Marks < 40");
                break;
            default:
                System.out.println("seeeeeeeeeefr");
                break;
        }

    }

    /**
     * 1-Watermelon
     * The first(and only)input line contains an integer number—the weight of the
     * watermelon bought by the boys. ( <--- English :D)
     */
    public static void watermelon() {
        Scanner scanner = new Scanner(System.in);

        // Read the weight of the watermelon
        int weight = scanner.nextInt();

        // Check if the weight can be divided into two even parts
        if (weight % 2 == 0 && weight > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    /**
     * 2-SortingThreeFloatingNumbers
     * Write a program that reads in three Floating-point numbers and sort them.
     */
    public static void sortThreeFloatingNumbers() {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = scanner.nextFloat();

        scanner.close();

        // 2.5
        // 9
        // 4
        if (num1 > num2) { // 2.5 > 9 => false
            float temp = num1; // block is skipped
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) { // 2.5 > 4 => false
            float temp = num1; // block is skipped
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) { // 9 > 4 => true
            float temp = num2; // temp = 9
            num2 = num3; // num2 = 4
            num3 = temp; // num3 = 9
        }

        System.out.println("Sorted numbers :");
        System.out.println(num1); // 2.5
        System.out.println(num2); // 4
        System.out.println(num3); // 9
    }

    /**
     * 3-MinAndMax
     * Write a program that reads in three integers and prints the minimum and
     * maximum
     */
    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        // Max -> shorthand if :)
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        // Min -> shorthand if :)
        int min = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        // Print the results ^.^
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}
