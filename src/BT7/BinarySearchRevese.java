package BT7;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class BinarySearchRevese {
    public static int binarySearch(Integer[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] > key) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1; // không tìm thấy giá trị cần tìm trong mảng
    }
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 7));
    }
}
