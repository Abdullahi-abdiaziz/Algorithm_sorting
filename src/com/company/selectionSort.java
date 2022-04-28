package com.company;

public class selectionSort {
    static void sort(int arr[]) {
        int len = arr.length;
        for (int i=0 ; i<len ; i++) {
            int minIdx = i;
            for (int j=i+1 ; j<len ; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { -2 , 14 , -6 , 4 , 21 };
        selectionSort.sort(arr);
        for ( int elm : arr) {
            System.out.print(elm+"  ");
        }
    }
}
