package NumberArray;

import java.util.Arrays;

public class ReplaceWithSum {
    public static void main(String args[]){
        int [] entry = new int[]{5,1,3,2,4};
        System.out.println("1 : " + Arrays.toString(replaceWithSum1(entry)));
        System.out.println("2 : " + Arrays.toString(replaceWithSum2(entry)));
    }

    public static int[] replaceWithSum1(int[] entry){
        int[] resultArray = new int[entry.length];

        for(int i = 0; i < resultArray.length; i++){
            int sum = 0;
            for(int j = 0; j < entry.length ; j++){
                if(j != i)
                    sum += entry[j];
            }
            resultArray[i] = sum;
        }
        return resultArray;
    }

    public static int[] replaceWithSum2(int[] entry){
        int[] resultArray = new int[entry.length];

        int sum = 0;
        for(int i = 0; i < entry.length; i++){
            sum += entry[i];
        }

        for (int j = 0 ; j < resultArray.length ; j++){
            resultArray[j] = sum - entry[j];
        }

        return  resultArray;
    }
}
