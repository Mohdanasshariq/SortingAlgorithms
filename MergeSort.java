package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    /*
     * public static void merge(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * // Read input from the user
     * System.out.print("Enter the number of elements: ");
     * int n = scanner.nextInt();
     * int[] arr = new int[n];
     * System.out.println("Enter the elements:");
     * for (int i = 0; i < n; i++) {
     * arr[i] = scanner.nextInt();
     * }
     * 
     * // Call the merge sort algorithm
     * mergeSort(arr, 0, arr.length - 1);
     * 
     * // Print the sorted array
     * System.out.println("Sorted array: " + Arrays.toString(arr));
     * }
     */
    public static int[] sort(int[] array, int left, int right) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the left and right halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArr[], if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArr[], if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}