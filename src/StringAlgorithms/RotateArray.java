package StringAlgorithms;

import java.util.Arrays;

public class RotateArray {

    public static void main(String args[]){
        System.out.println(rotate1("batatas"));
        System.out.println(rotate2("batatas"));
    }

    public static String  rotate1(String entry){
        char[] entryArray = entry.toCharArray();
        int last = entryArray.length-1;
        char aux;
        for(int i = 0 ; i < entryArray.length / 2;i++){
            aux = entryArray[i];
            entryArray[i] = entryArray[last];
            entryArray[last] = aux;
            last--;
        }
        return new String(entryArray);
    }

    public static String rotate2(String entry){
        char[]result = new char[entry.length()];
        int iteration = 0;
        for(int i = entry.length()-1; i >=0 ; i--){
            result[iteration] = entry.charAt(i);
            iteration++;
        }
        return new String(result);
    }
}
