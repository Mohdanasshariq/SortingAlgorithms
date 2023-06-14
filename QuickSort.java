package sorting;

import java.util.Scanner;

public class QuickSort {

    /*
     * public static void quick(String[] args) {
     * 
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Enter the number of values: ");
     * 
     * int numValues = scanner.nextInt();
     * 
     * int[] values = new int[numValues];
     * 
     * for (int i = 0; i < numValues; i++) {
     * 
     * System.out.print("Enter value " + (i + 1) + ": ");
     * 
     * values[i] = scanner.nextInt();
     * 
     * }
     * 
     * quickSort(values, 0, numValues - 1);
     * 
     * System.out.println("Sorted array:");
     * 
     * for (int value : values) {
     * 
     * System.out.print(value + " ");
     * 
     * }
     * 
     * }
     */
    public static int[] sort(int[] array, int low, int high) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static void quickSort(int[] array, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);

            quickSort(array, pivotIndex + 1, high);

        }

    }

    public static int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (array[j] < pivot) {

                i++;

                int temp = array[i];

                array[i] = array[j];

                array[j] = temp;

            }

        }

        int temp = array[i + 1];

        array[i + 1] = array[high];

        array[high] = temp;

        return i + 1;

    }

}
