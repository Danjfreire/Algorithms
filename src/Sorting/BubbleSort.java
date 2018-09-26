package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] entry = new int[]{2, 1, 5, 4, 6, 3, 7, 9, 8, 10};
        System.out.println(Arrays.toString(entry));
        System.out.println(Arrays.toString(bubbleSort(entry)));
    }

    public static int[] bubbleSort(int[] entry) {

        int aux;
        for (int i = 0; i < entry.length; i++) {
            for (int j = i + 1; j < entry.length; j++) {
                if (entry[i] > entry[j]) {
                    aux = entry[i];
                    entry[i] = entry[j];
                    entry[j] = aux;
                }
            }
        }
        return entry;
    }
}
