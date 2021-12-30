package com.nensi.learning.algorithms;

public class BubbleSort {

    private static void doBubbleSort(int arr[]) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                swap(arr, i, i + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void swap(int arr[], int i, int j) {
        if (i == j)
            return;
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 5, 8, 1, 2};
        doBubbleSort(arr);
    }
}
