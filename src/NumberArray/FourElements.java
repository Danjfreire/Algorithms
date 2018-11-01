package NumberArray;

import java.util.Arrays;

/**
 * Find four elements in an array whose sum is equal to a given X
 */

public class FourElements {

    public static void main(String[]args){

        naiveFourElements(new int[]{1,5,1,0,6,0},7);
        sortedFourElements(new int[]{1,5,1,0,6,0},7);
    }

    public static int naiveFourElements(int[]array, int x){
        for(int i = 0; i < array.length - 4;i++){
            for (int j = i+1; j < array.length - 3; j++){
                for (int z = j+1; z < array.length - 2; z++){
                    for (int w = z+1; w < array.length - 1; w++){
                        if(array[i]+array[j]+array[z]+array[w] == x){
                            System.out.println(array[i]+", "+array[j]+", "+array[z]+", "+array[w]);
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int sortedFourElements(int[]array, int x){
        Arrays.sort(array);
        int aux1;
        int aux2;

        for (int i = 0; i < array.length - 4; i++){
            for (int j = i+1; j < array.length - 3; j++){
                aux1 = j+1;
                aux2 = array.length-1;

                while (aux1<aux2){
                    int sum = array[i]+array[j]+array[aux1]+array[aux2];
                    if(sum == x){
                        System.out.println(array[i]+", "+array[j]+", "+array[aux1]+", "+array[aux2]);
                        return 1;
                    }else if(sum < x)
                        aux1++;
                    else if (sum > x)
                        aux2--;
                }
            }
        }
        return 0;
    }

}
