package BT6;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        sort(arr);
        System.out.println("Mảng sau khi được sắp xếp là: ");
        System.out.println(Arrays.toString(arr));
    }
}
