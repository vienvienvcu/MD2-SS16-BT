package TH3;

import java.sql.ClientInfoStatus;

import static TH3.SelectionSort.list;
import static TH3.SelectionSort.selectionSort;

public class main {
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
