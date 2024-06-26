package searching.sequential;

public class Main {
    public boolean checkExist(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int firstOccurPosition(int [] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;

}
//        tra ve tat ca cac vi tri xuat hien cua phan tu co gia tri value trang mang list
    public int[] allPositionOfValueInList(int [] list, int value) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                total ++;
            }
        }
        int[] result = new int[total];
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                result[total - 1] = i;
            }
        }
        return result;
    }

}
