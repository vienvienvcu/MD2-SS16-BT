package TH5;

import static TH5.BubbleSort.bubbleSort;
import static TH5.BubbleSort.list;

public class main {
    public static void main(String[] args) {

        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
