package org.example;

public class SortedOrNot {
    public static int[] sorted(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println();
        }

        System.out.println("after sorting the elements are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}

