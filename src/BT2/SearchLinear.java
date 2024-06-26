package BT2;

import java.util.Scanner;

public class SearchLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        // hiển thị các phần tử trong mảng
        // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
        System.out.println("hiển thị các phần tử trong mảng : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
//       tim vi tri bat ki trong mang hai chieu
        System.out.println("nhap vao mot so bat ki trong mang");
        int n = sc.nextInt();
        System.out.println(linearSearch(arr,n));
    }

    public static int linearSearch(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }

}

