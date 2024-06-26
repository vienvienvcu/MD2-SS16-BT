package BT3;

import java.util.Scanner;

public class MaxLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("nhap pahn tu thu" + i + ":");
            arr[i] = sc.nextInt();
        }
//        in ra cac phan tu cua mang da nhap

        for (int i : arr){
            System.out.print(i + ",");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("so lon nhat cua mang can tim la: "+max);
    }

}
