package BT9;

public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }else {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] > key) {
                return binarySearch(arr, key, low, mid - 1);
            }else {
                return binarySearch(arr, key, mid + 1, high);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 8, 9, 11, 12, 15, 17 };
        int key = 8;
        int index = binarySearch(arr, key, 0, arr.length - 1);
        if (index == -1 ){
            System.out.println("Element not found");
        }else {
            System.out.println(key + " được tìm thấy tại chỉ số " + index + " trong mảng.");
        }

    }
}
