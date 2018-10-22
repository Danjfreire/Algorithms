package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] entry = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(entry));
        System.out.println(Arrays.toString(bubbleSort(entry)));
    }

    public static int[] bubbleSort(int[] entry) {

        int aux;
        for (int i = 0; i < entry.length-1; i++) {
            for (int j = 0; j < entry.length-i-1; j++) {
                if (entry[j] > entry[j+1]) {
                    aux = entry[j+1];
                    entry[j+1] = entry[j];
                    entry[j] = aux;
                }
            }
        }
        return entry;
    }
}
