package searching.binary;

public class AlgorithsmOfBinarySearch {
    public  boolean checkExist(int[] list, int value) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (list[mid] == value) {
                return true;
            }else if (list[mid] > value) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return false;
    }
}
