/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessions;

/**
 *
 * @author Administrator
 */
public class SortingAndSearch {

    public static void main(String[] args) {
        // call whatever method you want to test here :)
        int[] arr = { 1, 8, 2, 3 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == value) {
                return mid;
            }

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > value) {
                right = mid - 1;
            }
            // Else the element can only be present in right subarray
            else {
                left = mid + 1;
            }
        }

        // element is not present in the array :(
        return -1;
    }

    public static int binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].equals(target)) {
                return mid;
            }

            if (arr[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }

}
