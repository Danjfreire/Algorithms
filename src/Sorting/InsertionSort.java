package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[]args){
        int[] entry = new int[]{12,11,13,5,6};
        insertionSortWhile(entry);
        System.out.println(Arrays.toString(entry));

    }

    public static void insertionSortFor(int[] array){

        for(int i = 1 ; i < array.length; i++){
            for(int j = i-1; j >= 0; j--){
                if( array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }

    public static void insertionSortWhile(int[] array){

        for (int i = 1 ; i < array.length ; i++){
            int j = i-1;
            int key = array[i];
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

}

/*
    12 11 13 5 6
    11 12 13 5 6
    5 11 12 13 6
    5 6 11 12 13
 */