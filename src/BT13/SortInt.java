package BT13;

import java.util.Arrays;

public class SortInt {
//    ham chen
     public static void sortInsert(int[] arr){
         for (int i = 1; i < arr.length; i++) {
             int key = arr[i];
             int j = i - 1;
             while (j >= 0 && arr[j] > key) {
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = key;
         }
     }
// noi bot
     public static void bubbleSort(int[] arr1){
         for (int i = 0; i < arr1.length; i++) {
             for (int j = 0; j < arr1.length-i-1; j++) {
                 if (arr1[j] > arr1[j + 1]) {
                     int temp = arr1[j];
                     arr1[j] = arr1[j + 1];
                     arr1[j + 1] = temp;
                 }
             }
         }
     }
//     selection sort
    public static void selectionSort(int[] arr2){
        for (int i = 0; i < arr2.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr2[minIndex];
            arr2[minIndex] = arr2[i];
            arr2[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] arr1 = {1,70,30,50,11};
        int[] arr2 = {64, 4, 12, 100, 11};
        sortInsert(arr);
        bubbleSort(arr1);
        selectionSort(arr2);
        System.out.println("Mảng sau khi sử dụng insert Sort: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng sau khi sử dụng bubble Sort: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Mảng sau khi sử dụng Selection Sort: ");
        System.out.println(Arrays.toString(arr2));

    }
}
