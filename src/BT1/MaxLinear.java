package BT1;

import java.util.Scanner;

public class MaxLinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
//        int size = scanner.nextInt();
        int[] array = new int[20];
//        nhap tung phan tu cho mang
        for (int i = 0; i < 20; i++) {
            System.out.println("nhap pahn tu thu" + i + ":");
            array[i] = (int) (Math.random() * 100);
        }
//        in ra cac phan tu trong mang
        System.out.println("Các phần tử trong mảng là:");
        for (int i: array ){
            System.out.print(i + ", ");
        }

        int max = array[0];
        for (int value: array){
            if(value > max){
                max = value;
            }
        }
        System.out.println("\n gia tri lon nhat trong mang la:"+ max);
    }
}
