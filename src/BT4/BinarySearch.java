package BT4;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] < key) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1; // không tìm thấy giá trị cần tìm trong mảng
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 90, 6, 8, 9, 30, 12, 15, 17 };
        int key = 9;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("\n Element not found");
        }else{
            System.out.println("\nElement found at index: " + index);
        }

    }
}
