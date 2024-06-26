package BT8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FindStringMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi bat ki :");
        String inputString = sc.nextLine();
        String [] inputStrings = inputString.split(" ");
        int lengthMax = 0;
        int index = 0;
        for (int i = 0; i < inputStrings.length; i++) {
            if (inputStrings[i].length() > lengthMax) {
                lengthMax = inputStrings[i].length();
                index = i;
            }
        }
        System.out.println("phan tu co chuoi co do dai lon nhat la: " + inputStrings[index] + " co do dai la: " + lengthMax + " tai vi tri thu: " +  index );
    }
}
