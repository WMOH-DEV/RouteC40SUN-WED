/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments;

import java.util.Arrays;

/**
 * This is the second assignment
 * 
 * @version 1.0
 * @since 2024-06-01
 */
public class Two {

    public static void main(String[] args) {
        // call whatever method you want to test here :)
    }

    /*
     * Write a function getSummition that takes array as parameter and returns
     * summation of its elements
     */
    public static int getSummation(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    /*
     * Write a function getNumOfElements that takes array as parameter and
     * returns the number of its elements
     */
    public static int getNumOfElements(int[] array) {
        return array.length;
    }

    /**
     * Write a function getMax that takes array as parameter and returns the max
     * value in the array
     */
    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Write a function getMin that takes array as parameter and returns the min
     * value in the array
     */
    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Write a function CalculateEven that takes array as parameter and calculate
     * the sum of even numbers and how many even numbers
     */
    public static int[] CalculateEven(int[] array) {
        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        return new int[] { sum, count };
    }

    /**
     * Write a function count2 that takes array as parameter and counts
     * occurrences of number 2
     */
    public static int count2(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 2) {
                count++;
            }
        }
        return count;
    }

    /**
     * Modify the above function to be CountGeneral that takes array as
     * parameter and count occurrences of every number in the array and print it
     * Ex. Input [1,2,3,1,3,6] output
     * 1 -> 2
     * 2 -> 1
     * 3 -> 3
     * 6 -> 1
     */
    public static void CountGeneral(int[] array) {
        int[] count = new int[1000];
        for (int num : array) {
            count[num]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " -> " + count[i]);
            }
        }
    }

    /**
     * Write function binary search that takes array and sorts it
     * hint -> search about binary search
     * 
     * !! What is the meaning of 'that takes array and sorts it', binary search not
     * used to sort arrays
     * !! I think it should be that takes array and target and returns the index of
     * the target
     */
    public static int binarySearch(int[] array, int target) {
        // Since the array is not sorted, we need to sort it first
        // otherwise binary search won't work
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // not found
    }

    /**
     * search about selection sort and implement it in function SelectionSort that
     * takes array as a parameter and sort it using the algorithm
     */
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * compare between binary search and linear search in terms of performance
     * and best case and worst case and average case.
     */
    public static void compareSearches() {
        // Linear search
        // Best case: O(1) when the element is found at the first index
        // Worst case: O(n) when the element is not found
        // Average case: O(n/2) = O(n) // n/2 because on average we will search half of
        // the array
        // array doesn't have to be sorted

        // Binary search
        // Best case: O(1) when the element is found at the middle
        // Worst case: O(log n) when the element is not found
        // Average case: O(log n) // log n because we divide the array by 2 each time
        // array must be sorted
    }

}
