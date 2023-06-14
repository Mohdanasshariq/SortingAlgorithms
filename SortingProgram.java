package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import sorting.BinarySort;
import sorting.BubbleSort;
import sorting.MergeSort;
import sorting.QuickSort;

import javax.xml.transform.Source;

public class SortingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // int[] array = { 5, 8, 2, 1, 6 }; // Example array, you can change this

        // Display available sorting algorithms
        System.out.println("Available sorting algorithms:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Binary Sort");
        System.out.println("4. Merge Sort");

        int choice = -1;
        boolean validChoice = false;

        // Loop until a valid choice is made
        while (!validChoice) {
            try {
                System.out.print("Enter the number corresponding to the sorting algorithm: ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 4) {
                    validChoice = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        int[] sortedArray = new int[0];
        // Sort the array based on the user's choice
        switch (choice) {
            case 1:
                // BubbleSort bubblesort = new BubbleSort();
                sortedArray = BubbleSort.sort(array);
                break;
            case 2:
                // QuickSort quicksort = new QuickSortSort();
                sortedArray = QuickSort.sort(array, 0, array.length - 1);
                break;
            case 3:
                // BinaySort binarysort = new BinarySort();
                sortedArray = BinarySort.sort(array);
                break;
            case 4:
                // MergeSort mergesort = new MergeSort();
                sortedArray = MergeSort.sort(array, 0, array.length - 1);
                break;
        }

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        scanner.close();
    }
    /*
     * Bubble Sort
     * private static void BubbleSort(int[] array) {
     * // Implementation of bubble sort algorithm
     * }
     * 
     * // Quick Sort
     * private static void QuickSort(int[] array, int low, int high) {
     * // Implementation of quick sort algorithm
     * }
     * 
     * // Binary Sort
     * private static void BinarySort(int[] array) {
     * // Implementation of binary sort algorithm
     * }
     * 
     * // Merge Sort
     * private static void MergeSort(int[] array, int low, int high) {
     * // Implementation of merge sort algorithm
     * }
     */
}
