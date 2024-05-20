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

    /**
     * 6-what is the value of x,y,z and w
     * int x =3;
     * int y =2;
     * int z =X++;
     * int w =++Y;
     */
    public static void whatIsTheValue() {
        int x = 3;
        int y = 2;
        int z = x++;
        int w = ++y;

        System.out.println("x = " + x); // 4 😎 // because x was incremented after being assigned to z
        System.out.println("y = " + y); // 3 😎 // because y was incremented before being assigned to w
        System.out.println("z = " + z); // 3 😎 // because z was assigned the value of x before x was incremented
        System.out.println("w = " + w); // 3 😎 // because w was assigned the value of y after y was incremented
    }

    /**
     * 7-Write a program to calculate the sum of positive integers and sum of
     * negative integers for 6 integers.
     */
    public static void sumOfPositiveAndNegativeIntegers() {
        Scanner scanner = new Scanner(System.in);

        // Initialize sums
        int sumPositive = 0; // pre var To store the sum of positive integers
        int sumNegative = 0; // pre var To store the sum of negative integers

        // Read 6 integers from the user
        System.out.println("Enter 6 integers:");

        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt(); // the next integer input

            // Check if the number is positive
            if (num > 0) {
                sumPositive += num; // Add the positive number to sumPositive
            }
            // Check if the number is negative
            else if (num < 0) {
                sumNegative += num; // Add the negative number to sumNegative
            }
        }

        scanner.close(); // Close the scanner 😣

        // Print the results 🥳
        System.out.println("Sum of positive integers: " + sumPositive);
        System.out.println("Sum of negative integers: " + sumNegative);
    }

    /**
     * 8-Write a Java program to print the area of a circle.
     */
    public static void areaOfCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        scanner.close();

        double pi = 3.141592653589793; // Value of π from internet 😅
        double area = pi * radius * radius; // Calculate the area of the circle

        // Print the result
        System.out.println("Area is = " + area);

    }

    /**
     * 9-A program to print numbers divisible by 5, for the integers from 1 to 99.
     */
    public static void numbersDivisibleBy5() {
        for (int i = 1; i <= 99; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 10-Your program print the numbers from one up to 100 in ascending order
     */
    public static void numbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /**
     * 11-Your program print the numbers from one up to 100 in descending order
     */
    public static void numbersFrom100To1() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * 12-You take two number from the user , base and power The output: Base ^
     * power
     */
    public static void powerNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the power number: ");
        int power = scanner.nextInt();

        scanner.close();

        long result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println(base + " ^ " + power + " = " + result);
    }

    /**
     * 13-You will take number from the user Write a java program to print its
     * factorial.
     */
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    /**
     * 14-program to display the following sequence of numbers
     * : 7 14 21 28 35 42 49 56 63 70 77 84 91 98
     */
    public static void sequenceOfNumbers() {
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
    }

    /**
     * 15-Program to display the following sequence of numbers:
     * 1 2 4 8 16 32 64 128 256 512
     */
    public static void sequenceOfNumbers2() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    /**
     * 16-Write an application that calculates the product of the odd integers from
     * 1 to 15.
     */
    public static void productOfOddIntegers() {
        int product = 1;

        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        System.out.println("Product of odd integers from 1 to 15: " + product);

    }

    /**
     * 17-Write a java program that read positive numbers from user Until read a
     * negative number ... then calculate and print The average of these numbers.
     */
    public static void averageOfPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
            count++;
        }

        scanner.close();

        double average = (double) sum / count;

        System.out.println("Average of the numbers: " + average);
    }

    /**
     * 18- Write java program to read integer from user then print sum of digit
     * means add all the digits of any number for example if user enter 123 .output
     * is 6 because 1 +2 +3 = 6 an so on
     */
    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    /**
     * 19-Write java program to read an integer from user then print how many digit
     * in this number
     */
    public static void countDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }

    /**
     * 20-Given a number, print how many times can we divide it by 2?
     */
    public static void divideBy2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int count = 0;

        while (number % 2 == 0) {
            number /= 2;
            count++;
        }

        System.out.println("Number of times we can divide by 2: " + count);
    }

    /**
     * 13-Write a program that displays all the numbers from 100 to
     * 200, ten per line, that are divisible by 5 or 6, but not both.
     * Numbers are separated by exactly one space
     */
    public static void numbersDivisibleBy5Or6() {
        for (int i = 100; i <= 200; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && (i % 5 != 0 && i % 6 != 0)) {
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

}
