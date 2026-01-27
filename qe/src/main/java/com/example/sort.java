package com.example;

public class sort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 2, 5 };
        for (int i = 1; i < arr.length; i++) {
            int ele = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > ele)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ele;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
